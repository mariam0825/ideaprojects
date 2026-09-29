package StudentClass;

    public class StudentClass {

        private String name.toLowerCase();
        private int gradeLevel;
        private int score;

    }
    public int getGradeLevel() {
        this.name = name.toLowerCase();
        this.gradeLevel = 0;
    }

        public String getName() {
            return name;
        }

        public int getGradeLevel() {
            return gradeLevel;
        }

        public void studentLevel(int gradeLevel) {
            if (gradeLevel < 0) {
                throw new IllegalArgumentException("Nothing like grade 0");
            }

            this.gradeLevel = gradeLevel;
        }

        public void promotion(int gradeLevel) {
            if (gradeLevel < 0) {
                throw new IllegalArgumentException("Nothing like grade 0");
            }

            this.gradeLevel += 1;
        }

        public String scores(int score) {
            if (score < 0) {
                throw new IllegalArgumentException("You can never make it!!!");
            } else if (score < 50) {
                this.score = score;
                return "failed";
            } else {
                this.score = score;
                return "passed";
            }
        }

        public String updateName(String newName) {
            if (newName == null) {
                throw new IllegalArgumentException("Oga input your name !!!");
            }

            this.name = newName.toLowerCase();
            return this.name;
        }

        public String isGraduating(int gradeLevel) {
            if (gradeLevel < 12) {
                return "still a student";
            } else {
                return "Graduating students";
            }
        }
