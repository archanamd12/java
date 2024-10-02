package Employee;
 class Employee {
    int id;
    String name;
    String dept;
    
    Employee(int id,String name,String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;

    }
    void printdata(){
        System.out.println("details are"+id +name +dept);

    }

    public static void main(String[] args) {
        Employee e1=new Employee(341,"alice","cs");
        Employee e2=new Employee(322, "bob", "HR");
        e1.printdata();
    }
}


