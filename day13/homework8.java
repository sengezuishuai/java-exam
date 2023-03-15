public class homework8 {
    public static void main(String[] args){
        // 使用带有所有参数的构造器创建Employee对象
        Employee employee1 = new Employee("张三", 'M', 28, "教师", 20000);

// 使用仅包含姓名、性别和年龄参数的构造器创建Employee对象
        Employee employee2 = new Employee("李四", 'F', 25);

// 使用仅包含职位和薪资参数的构造器创建Employee对象
        Employee employee3 = new Employee("经理", 50000);
    }
}

class Employee{
    String name = "senge";
    char gender = 'B';
    int age = 18;
    String Position = "teacher";
    int salary = 18000;
    public Employee(String name,char gender,int age,
                    String Position,int salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.Position = Position;
        this.salary = salary;
    }
    public Employee(String name,char gender,int age){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Employee(String Position,int salary){
        this.Position = Position;
        this.salary = salary;
    }
}