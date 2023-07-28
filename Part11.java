import java.util.*;

class Student
{
    public int Rno;
    public String Name;
    public int Age;
    public int Marks;

    public static int Generator;
    static
    {
        Generator=0;
    }

    public Student(String str,int X,int Y)
    {
    this.Rno=++Generator;
    this.Name=str;
    this.Age=X;
    this.Marks=Y;

    }
    public  void Display()
    {
        System.out.println("|"+this.Rno+"|" + " " + "|"+this.Name+"|" + " " +"|" +this.Age+"|" +" "+ "|"+this.Marks+"|");
    }

    


}
class DBMS
    {
        public LinkedList <Student> lobj;
        public DBMS()
        {
            lobj =new LinkedList<Student>();
        }

        public  void StartDBMS()
        {
            System.out.println("Marvellous DBMS Started Succesfully..");
            System.out.println("Table Scema Created Succesfully..");

            String Query;
            String Tokens[];
            Scanner sobj=new Scanner(System.in);
            int Tokenscount =0;


            while(true)
            {
                System.out.print("Marvellous DBMs : ");
                Query=sobj.nextLine();

                Tokens = Query.split(" ");
                Tokenscount = Tokens.length;

                if(Tokenscount == 1)
                {
                    if("exit".equals(Tokens[0]))
                    {
                        System.out.println("Thank You for using Marvellous DBMS .");
                        break;
                    }

                }
                else if(Tokenscount == 2)
                {

                }
                else if(Tokenscount == 3)
                {

                }
                else if(Tokenscount == 4)
                {
                    if("select".equals(Tokens[0]))
                    {
                        Selectfrom();
                    }

                }
                else if(Tokenscount == 5)
                {

                }
                else if(Tokenscount == 6)
                {

                }
                else if(Tokenscount == 7)
                {
                    if("insert".equals(Tokens[0]))
                    {
                        InsertintoTable(Tokens[4], Integer.parseInt(Tokens[5]), Integer.parseInt( Tokens[6]));
                    }
                    else if("delete".equals(Tokens[0]))
                    {
                        Deletefrom(Integer.parseInt(Tokens[6]));
                    }

                }
            }
        }

        // Insert into student values(___,___,___);
        public void InsertintoTable(String name,int age,int marks)
        {
            Student sobj = new Student(name,age,marks);
            lobj.add(sobj);
        }
        // Select * from student
        public void Selectfrom()
        {
            System.out.println("Records from the student Database are :");

            for(Student sref : lobj)
            {
                sref.Display();
            }
        }

        //Select * from student where Rno =11
        public void Selectfrom(int no)
        {
            System.out.println("Records from the student are :");
            for(Student sref : lobj)
            {
                if(sref.Rno == no)
                {
                    sref.Display();
                    break;
                }
            }
        }

        //Select * from student where name =Sayali
        public void Selectfrom(String str)
        {
            System.out.println("Records from the student are :");
            for(Student sref : lobj)
            {
               if(str.equals(sref.Name))
                {
                    sref.Display();
                    break;
                }
            }
        }

        //Select MAX(marks)from student
       
        public int Aggregate_MAX()
        {
            int iMax =0;
            System.out.println("Records from the student are :");
            for(Student sref : lobj)
            {
               if(sref.Marks > iMax)
                {
                    iMax =sref.Marks;
                }
            }
            return iMax;
        }

        //Select MIN(marks)from student
        public int Aggregate_MIN()
        {
            
            Student temp = lobj.get(0);
            int iMin =temp.Marks;
            System.out.println("Records from the student are :");
            for(Student sref : lobj)
            {
               if(sref.Marks < iMin)
                {
                    iMin =sref.Marks;
                }
            }
            return iMin;
        }
        // Selct SUM(marks) from student
        public int Aggregate_Sum()
        {
            
            int isum=0;
            System.out.println("Records from the student are :");
            for(Student sref : lobj)
            {
               
                    isum = isum+sref.Marks;
                
            }
            return isum;
        }
        //Select AVG(Marks) from student
        public int Aggregate_Marks()
        {
            
            int isum=0;
            System.out.println("Records from the student are :");
            for(Student sref : lobj)
            {
               
                    isum = isum+sref.Marks;
                
            }
            return (isum/lobj.size()) ;
        }
        // Delete from student name Rno = 2
        public void Deletefrom(int no)
        {
            
            int i=0;
            
            for(Student sref : lobj)
            {
               
                   lobj.remove();
                   break;
                
            }
            i++;
        }
    }


class Part11
{
    public static void main(String Arg[])
    {
        DBMS obj=new DBMS();
        obj.StartDBMS();
        /* 

        obj.InsertintoTable("Rahul", 23, 89);
        obj.InsertintoTable("Sagar", 26, 98);
        obj.InsertintoTable("Pooja", 20, 56);
        obj.InsertintoTable("Sayali", 30, 78);
        obj.InsertintoTable("Tejas", 29, 68);

        obj.Selectfrom();
        obj.Selectfrom(4);
        obj.Selectfrom(10);
        obj.Selectfrom("Tejas");

        System.out.println("Maximum marks :" +obj.Aggregate_MAX());
        System.out.println("Minimum marks :" +obj.Aggregate_MIN());
        System.out.println("Sum of marks :" +obj.Aggregate_Sum());
        System.out.println("Average of marks :" +obj.Aggregate_Marks());
        obj.Deletefrom(4);
        obj.Selectfrom();
        */




    }
}


/*
 Inser Query

 Insert into Student Values Rahul 23 67
 0        1    2       3      4    5  6   

 Total no.Tokens=7.

 select * from student
 0      1   2    3
 Total no.Tokens = 4

 delete from student where Rno  =  4
   0     1    2       3     4   5  6.
   total no.Tokens =7

   Select Max age from student
   0       1   2    3    4
   Token =5

  */

