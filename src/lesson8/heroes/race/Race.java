package lesson8.heroes.race;

/**
 * @author a.shestovsky
 */

public enum Race implements Inborn {
    HUMAN {
        @Override
        public String getRace() {
            return "человек";
        }
    },
    ELF {
        @Override
        public String getRace() {
            return "эльф";
        }
    },
    ORC {
        @Override
        public String getRace() {
            return "орк";
        }
    }
}