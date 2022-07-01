/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_1;

/**
 *
 * @author Ryan Mamaril
 */
class User {
    private String Employee_Num, Employee_FirstName, Employee_MiddleName, Employee_LastName, UserName, Password;
    private Boolean Admin;
    
    public User(String Employee_Num, String Employee_FirstName, String Employee_MiddleName, String Employee_LastName, String UserName, String Password, Boolean Admin)
    {
        this.Employee_Num = Employee_Num;
        this.Employee_FirstName = Employee_FirstName;
        this.Employee_MiddleName = Employee_MiddleName;
        this.Employee_LastName = Employee_LastName;
        this.UserName = UserName;
        this.Password = Password;
        this.Admin = Admin;
    }
    public String getEmployee_Num(){return Employee_Num;}
    public String getEmployee_FirstName(){return Employee_FirstName;}
    public String getEmployee_MiddleName(){return Employee_MiddleName;}
    public String getEmployee_LastName(){return Employee_LastName;}
    public String getUserName(){return UserName;}
    public String getPassword(){return Password;}
    public Boolean getAdmin(){return Admin;}
}
