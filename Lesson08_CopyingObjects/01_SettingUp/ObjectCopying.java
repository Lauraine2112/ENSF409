import java.util.Arrays;

public class ObjectCopying {

    public static void main(String[] args){

        Animal horse1 = new Animal("Horse","Equidae","Chordata","Blaze");
        String[] horse1Skills = new String[]{"Jumping", "Dressage"};
        horse1.setAnimalSkills(horse1Skills);
        horse1.setRider("Alex", 4321, 30);
        
        System.out.println("Name: " + horse1.getAnimalName());
        System.out.println("Skills: " + Arrays.toString(horse1.skills));
        System.out.println("Rider: " + horse1.getRider().getRiderName());
    }   
}


class Animal {
        private String animalSpecies;
        private String animalFamily;        
        private String animalPhylum;
        private String animalName;
        private Rider animalRider = new Rider();
        public String[] skills = new String[10];

        public Animal(){
            
        }
                
        public Animal(String animalSpecies, String animalFamily, String animalPhylum, String animalName)
        {
            this.animalSpecies = animalSpecies;
            this.animalFamily = animalFamily;
            this.animalPhylum = animalPhylum;
            this.animalName = animalName;
        }

        public void setAnimalPhylum(String animalPhylum)
        {
            this.animalPhylum = animalPhylum;
        }

        public void setAnimalFamily(String animalFamily)
        {
            this.animalFamily = animalFamily;
        }

        public void setAnimalSpecies(String animalSpecies)
        {
            this.animalSpecies = animalSpecies;
        }

        public void setAnimalName(String animalName)
        {
            this.animalName = animalName;
        }
        
        public void setRider(String name, int regNumber, int age)
        {
            this.animalRider.setRiderName(name);
            this.animalRider.setRiderRegNumber(regNumber);
            this.animalRider.setAge(age);
            
        }

        public void setAnimalSkills(String[] skills)
        {
            this.skills = skills;
        }

        public String getAnimalPhylum() {
            return animalPhylum;
        }

        public String getAnimalFamily() {
            return animalFamily;
        }

        public String getAnimalSpecies() {
            return animalSpecies;
        }

        public String getAnimalName() {
            return animalName;
        }
        
        public Rider getRider(){
            return animalRider;
        }
        
}

class Rider{
        private String riderName;
        private int riderRegNumber;
        private int age;
        
        public Rider(){
            
        }
                
        public Rider(String riderName, int riderRegNumber, int age)
        {
            this.riderName = riderName;
            this.riderRegNumber = riderRegNumber;
            this.age = age;
        }

        public void setRiderName(String riderName)
        {
            this.riderName = riderName;
        }
        
        public void setRiderRegNumber(int riderRegNumber)
        {
            this.riderRegNumber = riderRegNumber;
        }
        
        public void setAge(int age)
        {
            this.age = age;
        }
        
        public String getRiderName() {
            return riderName;
        }

        public int getRiderRegNumber() {
            return riderRegNumber;
        }

        public int getAge() {
            return age;
        }      
}

  
