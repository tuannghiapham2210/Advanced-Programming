class TechCourse{
    private String name;
    private int credits;
    private int capacity;

    public TechCourse(String name, int credits, int capacity){
        this.name = name;
        this.credits = credits;
        this.capacity = capacity;
    }

    public void updateCapacity(int Capacity){
        if (Capacity <= 0 || Capacity > 500){
            System.out.println("invalid capacity, update capacity failed");
        }
        else{
            System.out.println("capacity updated successfully, new capacity is: " + capacity);
        }
    }

    public void displayCourseInfo(){
        System.out.println("Course name: " + this.name);
        System.out.println("Number of credits: " + this.credits);
        System.out.println("Maximum number of students: " + this.capacity);
    }

}

public class Main{
    public static void main(String[] args){
        String name;
        if (args.length >= 1){
            name = args[0];
        }
        else{
            name = "DSA";
        }
        int credits = 4;
        int capacity = 120;

        TechCourse course = new TechCourse(name, credits, capacity);

        course.displayCourseInfo();
    }
}