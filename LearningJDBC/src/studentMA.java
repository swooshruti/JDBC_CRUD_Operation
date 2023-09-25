import com.student.manage.Student;
import com.student.manage.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class studentMA  {

    public static void main(String[] args)throws IOException{
        System.out.println("Welcome to student Management app");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        while(true){

            System.out.println("Press 1 to ADD Student");

            System.out.println("Press 2 to Delete Student");

            System.out.println("Press 3 to Display Student");

            System.out.println("Press 4 to Exit");
            int c=Integer.parseInt(br.readLine());

            if(c==1){
                System.out.println("Enter user name:");
                String name=br.readLine();

                System.out.println("Enter user Phone:");
                String phone=br.readLine();

                System.out.println("Enter user city:");
                String city=br.readLine();

                Student st=new Student(name,phone,city);
                boolean answer= StudentDao.insertStudentToDB(st);
                if(answer){
                    System.out.println("Student Successfully Added");

                }
                else{
                    System.out.println("Something went wrong..try again");
                }
                System.out.println(st);


            }
            else if (c==2){
                System.out.println("Enter Student Id to delete: ");
                int userId= Integer.parseInt(br.readLine());
                boolean answer=StudentDao.deleteStudent(userId);

                if(answer){
                    System.out.println("Student Successfully Deleted");

                }
                else{
                    System.out.println("Something went wrong..try again");
                }

            }
            else if (c==3){

                StudentDao.displayStudent();




            }
            else if (c==4){
                break;
            }
            else {}


        }
        System.out.println("Thank you for using student Management app");

    }
}
