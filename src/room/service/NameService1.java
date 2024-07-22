package room.service;

import room.model.Name;

public class NameService1 {

    public static Name[] convert(String[] data) {
        Name [] names = new Name[data.length];

        for (int i = 0; i < data.length; i++) {
            names[i] = new Name(data[i]);
        }
        return names;
    }

    public static Name maxName(Name[] names) {
        Name max = names[0];

        for (int i = 1; i < names.length; i++) {
            if (names[i].getYear() < max.getYear()) {
                max = names[i];
            }
        }
        return max;
    }


}
