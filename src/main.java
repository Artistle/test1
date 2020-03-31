public class main {
    public static void main(String args[]){
        Vacancy vacancy = new Vacancy();
        User tester = new User(7,vacancy);
        System.out.println(tester.getId());
        System.out.println(tester.getVacance());

    }
    static class User{
        private long id;
        private Vacancy vacance;


        public User(long id, Vacancy vacance) {
            this.id = id;
            this.vacance = vacance;
        }

        public long getId() {
            return id;
        }

        public String getVacance() {
            return vacance.getVacany();
        }
    }

    static class Vacancy{
        String getVacany(){
            return "developer";
        }

    }
}
