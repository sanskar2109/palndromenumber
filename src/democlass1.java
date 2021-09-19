//defination class
class stu
{
    int rollno;
    String name;
    int marks[];

    stu()// non parmatrizedd
    {
        rollno = 10;
        name = "sanskar";
        marks= new int[5];
        for (int i = 0; i <marks.length ; i++) {
            marks[i]=95;
        }
    }
    public void display()
    {
        System.out.println(rollno);
        System.out.println(name);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}//execution class
public class democlass1 {
    public static void main(String[] args) {
        stu obj1= new stu();
        obj1.display();
    }
}
