// IPerson interface
interface IPerson {
    String getName();
}

// Villager class implementing IPerson interface
class Villager implements IPerson {
    @Override
    public String getName() {
        return "Village Person";
    }
}

// CityPerson class implementing IPerson interface
class CityPerson implements IPerson {
    @Override
    public String getName() {
        return "City Person";
    }
}

// Enum defining types of persons
enum PersonType {
    Rural,
    Urban
}

// PersonFactory class responsible for creating IPerson objects
class PersonFactory {
    public IPerson getPerson(PersonType type) {
        switch (type) {
            case Rural:
                return new Villager();
            case Urban:
                return new CityPerson();
            default:
                throw new IllegalArgumentException("Unsupported PersonType");
        }
    }
}


