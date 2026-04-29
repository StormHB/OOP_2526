package inner_loc_cls_final.zadatak_5_1_A1;

public class User {
    private final String id;
    private final String name;
    private final String email;

    private User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static User createEmpty() {
        return new User(null, null, null);
    }

    public Builder builder() {
        return new Builder();
    }

    public class Builder {
        private String id = User.this.id;
        private String name = User.this.name;
        private String email = User.this.email;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(id, name, email);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}