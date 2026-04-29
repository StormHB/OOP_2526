package inner_loc_cls_final.zadatak_7_2;

public class LocalExpressionEval {

    public static int eval(String expr) {

        class Token {
            String type;
            int value;

            Token(String type, int value) {
                this.type = type;
                this.value = value;
            }
        }

        class Lexer {
            int pos = 0;

            Token next() {
                while (pos < expr.length() && Character.isWhitespace(expr.charAt(pos))) {
                    pos++;
                }

                if (pos >= expr.length()) {
                    return new Token("EOF", 0);
                }

                char c = expr.charAt(pos);

                if (Character.isDigit(c)) {
                    int num = 0;

                    while (pos < expr.length() && Character.isDigit(expr.charAt(pos))) {
                        num = num * 10 + (expr.charAt(pos) - '0');
                        pos++;
                    }

                    return new Token("NUMBER", num);
                }

                pos++;

                if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')') {
                    return new Token(String.valueOf(c), 0);
                }

                throw new IllegalArgumentException("Neočekivani znak: " + c);
            }
        }

        class Parser {
            Lexer lexer = new Lexer();
            Token current = lexer.next();

            void eat(String type) {
                if (!current.type.equals(type)) {
                    throw new IllegalArgumentException("Očekivano: " + type + ", dobiveno: " + current.type);
                }

                current = lexer.next();
            }

            int parseExpression() {
                int result = parseTerm();

                while (current.type.equals("+") || current.type.equals("-")) {
                    if (current.type.equals("+")) {
                        eat("+");
                        result += parseTerm();
                    } else {
                        eat("-");
                        result -= parseTerm();
                    }
                }

                return result;
            }

            int parseTerm() {
                int result = parseFactor();

                while (current.type.equals("*") || current.type.equals("/")) {
                    if (current.type.equals("*")) {
                        eat("*");
                        result *= parseFactor();
                    } else {
                        eat("/");
                        int divisor = parseFactor();

                        if (divisor == 0) {
                            throw new IllegalArgumentException("Dijeljenje s nulom.");
                        }

                        result /= divisor;
                    }
                }

                return result;
            }

            int parseFactor() {
                if (current.type.equals("NUMBER")) {
                    int value = current.value;
                    eat("NUMBER");
                    return value;
                }

                if (current.type.equals("(")) {
                    eat("(");
                    int value = parseExpression();
                    eat(")");
                    return value;
                }

                throw new IllegalArgumentException("Očekivan broj ili zagrada.");
            }

            int parse() {
                int result = parseExpression();

                if (!current.type.equals("EOF")) {
                    throw new IllegalArgumentException("Višak izraza nakon kraja: " + current.type);
                }

                return result;
            }
        }

        Parser parser = new Parser();
        return parser.parse();
    }
}