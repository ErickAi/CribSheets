package core.ObjectMethods;

import java.util.LinkedHashMap;
import java.util.Map;

public class DeepCloneClassWhithMap implements Cloneable {


    public static void main(String[] args) {
        DeepCloneClassWhithMap DeepCloneClassWhithMap = new DeepCloneClassWhithMap();
        DeepCloneClassWhithMap.users.put("Hubert", new User(172, "Hubert"));
        DeepCloneClassWhithMap.users.put("Zapp", new User(41, "Zapp"));
        DeepCloneClassWhithMap clone = null;
        try {
            clone = DeepCloneClassWhithMap.clone();
            System.out.println(DeepCloneClassWhithMap);
            System.out.println(clone);

            System.out.println(DeepCloneClassWhithMap.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (age != user.age) return false;
            return name != null ? name.equals(user.name) : user.name == null;
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            return (User) super.clone();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof DeepCloneClassWhithMap)) return false;

        DeepCloneClassWhithMap DeepCloneClassWhithMap = (DeepCloneClassWhithMap) o;

        return users != null ? users.equals(DeepCloneClassWhithMap.users) : DeepCloneClassWhithMap.users == null;
    }

    @Override
    public int hashCode() {
        return users != null ? users.hashCode() : 0;
    }

    @Override
    protected DeepCloneClassWhithMap clone() throws CloneNotSupportedException {
        DeepCloneClassWhithMap sol = (DeepCloneClassWhithMap) super.clone();
        Map<String, User> map = new LinkedHashMap<String, User>();
        for (Map.Entry<String, User> entry : users.entrySet()){
            map.put(entry.getKey(), entry.getValue().clone());
        }
        sol.users = map;
        return sol;
    }
}
