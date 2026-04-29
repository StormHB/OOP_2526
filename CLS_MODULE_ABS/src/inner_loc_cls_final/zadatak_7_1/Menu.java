package inner_loc_cls_final.zadatak_7_1;

import java.util.*;

public class Menu {

    private final List<Item> items = new ArrayList<>();

    public abstract class Item {
        protected String name;

        public Item(String name) {
            this.name = name;
        }

        abstract void print(int indent);
    }

    public class ActionItem extends Item {
        private Runnable action;

        public ActionItem(String name, Runnable action) {
            super(name);
            this.action = action;
        }

        @Override
        void print(int indent) {
            System.out.println("  ".repeat(indent) + "- " + name);
        }

        public void run() {
            action.run();
        }
    }

    public class SubmenuItem extends Item {
        private final List<Item> children = new ArrayList<>();
        private final SubmenuItem parent;

        public SubmenuItem(String name, SubmenuItem parent) {
            super(name);
            this.parent = parent;
        }

        public SubmenuItem action(String name, Runnable action) {
            children.add(new ActionItem(name, action));
            return this;
        }

        public SubmenuItem submenu(String name) {
            SubmenuItem sub = new SubmenuItem(name, this);
            children.add(sub);
            return sub;
        }

        public SubmenuItem end() {
            return parent;
        }

        @Override
        void print(int indent) {
            System.out.println("  ".repeat(indent) + "+ " + name);
            for (Item child : children) {
                child.print(indent + 1);
            }
        }
    }

    public SubmenuItem submenu(String name) {
        SubmenuItem sub = new SubmenuItem(name, null);
        items.add(sub);
        return sub;
    }

    public Menu action(String name, Runnable action) {
        items.add(new ActionItem(name, action));
        return this;
    }

    public void print() {
        for (Item item : items) {
            item.print(0);
        }
    }
}