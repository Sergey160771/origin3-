package seminar6;

public class Cat {

        private String name;
        private String sex;
        private String breed;
        private Integer age;
        private String owner;

        public Cat(String name, String sex, String breed, Integer age, String owner) {
            this.name = name;
            this.sex =sex;
            this.breed = breed;
            this.age = age;
            this.owner = owner;
        }
    public void printInfo(){
            System.out.printf ("name :%s\n sex :%s\n breed :%s\n age :%d\n owner :%s\n",name,sex,breed,age,owner);
    }
    public String getName() {
        return name;
    }



    public String getSex() {
        return sex;
    }



    public String getBreed() {
        return breed;
    }



    public Integer getAge() {
        return age;
    }



    public String getOwner() {
        return owner;
    }


}

