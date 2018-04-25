public  class Student extends   Person{

    //Person p = new Student();

    private int k;
    public Student() {}

    public Student(int k) {
        this.k = k;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }


    public void displayData() {
        System.out.println("abstract method of abstract class");
        //super.displayData();
    }
}
