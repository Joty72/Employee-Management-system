//import javax.sql.rowset.Joinable;
//import javax.sql.rowset.spi.SyncResolver;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Employee {
    private String id;
    private String name;
    private String email;
    private String gender;
    private String department;
    private double salary;
    private double loan;

    public Employee(String id, String name, String email, String gender, String department, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.loan = 0.0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nEmail: " + email + "\nDepartment: " + department + "\nSalary: $" + salary + "\nLoan: $" + loan;
    }
}
class EmployeeLeave {
    private String name;
    private String leaveType;
    private String leaveDate;

    public EmployeeLeave(String name, String leaveType, String leaveDate) {
        this.name = name;
        this.leaveType = leaveType;
        this.leaveDate = leaveDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public String getName() {
        return name;
    }

    public String getLeaveType() {
        return leaveType;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Leave Type: " + leaveType + ", Leave Date: " + leaveDate;
    }
}
class Login extends JFrame implements ActionListener {
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<EmployeeLeave> employeeLeaves = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addleave(EmployeeLeave employeeLeave) {
        employeeLeaves.add(employeeLeave);
    }


    JLabel username;
    JTextField tUsername;
    JLabel password;
    JPasswordField pPassword;
    JButton login;
    JButton exit;

    public Login() {
        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 100, 100);
        JLabel title = new JLabel("Employee Management System");
        title.setBounds(50, 20, 500, 30);
        Font font = new Font("Arial", Font.PLAIN, 20);
        title.setFont(font);
        add(title);
        JLabel pic = new JLabel();
        pic.setBounds(120, 70, 150, 70);
        pic.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\EmpIcon1.png"));
        add(pic);
        username = new JLabel("Username");
        username.setBounds(30, 170, 70, 30);
        add(username);
        tUsername = new JTextField();
        tUsername.setBounds(120, 170, 130, 26);
        add(tUsername);
        password = new JLabel("Password");
        password.setBounds(30, 220, 70, 30);
        add(password);
        pPassword = new JPasswordField();
        pPassword.setBounds(120, 220, 130, 26);
        add(pPassword);
        login = new JButton("Login");
        login.setBounds(120, 260, 130, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);

        login.addActionListener(this);
        add(login);
        exit = new JButton("Exit");
        exit.setBounds(120, 300, 130, 30);
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.white);


        exit.addActionListener(this);
        add(exit);
        setBounds(450, 200, 400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == login) {

            String user = tUsername.getText();
            String pwd = pPassword.getText();
            if (user.equals("name") && pwd.equals("password")) {
                JOptionPane.showMessageDialog(null, "Login Succesfully");
                dispose();
                JLabel pic1=new JLabel();
                pic1.setBounds(0,60,400,400);
                pic1.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\empppp11.jpg"));

                JFrame frame = new JFrame("Employee Details");
                JButton addEmployee = new JButton("Add Employee");
                addEmployee.setBounds(0, 0, 120, 40);
                addEmployee.setBackground(Color.BLACK);
                addEmployee.setForeground(Color.white);
                addEmployee.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JFrame frame1 = new JFrame("Add Employee");
                        JLabel pic2=new JLabel();
                        pic2.setBounds(190,0,250,250);
                        pic2.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\EmployeeDetail.jpg"));
                        frame1.add(pic2);
                        JTextField id = new JTextField();
                        id.setBounds(90, 20, 100, 25);
                        JTextField name = new JTextField();
                        name.setBounds(90, 50, 100, 25);
                        JTextField email = new JTextField();
                        email.setBounds(90, 80, 100, 25);
                        JTextField gender = new JTextField();
                        gender.setBounds(90, 110, 100, 25);
                        JTextField department = new JTextField();
                        department.setBounds(90, 140, 100, 25);
                        JTextField salary = new JTextField();
                        salary.setBounds(90, 170, 100, 25);

                        JLabel idLabel = new JLabel("ID");
                        idLabel.setBounds(20, 20, 100, 30);
                        JLabel nameLabel = new JLabel("Name");
                        nameLabel.setBounds(20, 50, 100, 30);
                        JLabel emailLabel = new JLabel("Email");
                        emailLabel.setBounds(20, 80, 100, 30);
                        JLabel genderLabel = new JLabel("Gender");
                        genderLabel.setBounds(20, 110, 100, 30);
                        JLabel departmentLabel = new JLabel("Department");
                        departmentLabel.setBounds(20, 140, 100, 30);
                        JLabel salaryLabel = new JLabel("Salary");
                        salaryLabel.setBounds(20, 170, 100, 30);

                        JButton Submit = new JButton("Submit");
                        Submit.setBounds(40, 210, 80, 35);
                        Submit.setBackground(Color.BLACK);
                        Submit.setForeground(Color.white);
                        Submit.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String ids = id.getText();
                                String names = name.getText();
                                String emails = email.getText();
                                String genders = gender.getText();
                                String departments = department.getText();
                                String salarys = salary.getText();


                                if (!ids.isEmpty() && !names.isEmpty() && !emails.isEmpty() && !genders.isEmpty() && !departments.isEmpty() && !salarys.isEmpty()) {
                                    try {
                                        double salaryss = Double.parseDouble(salary.getText());
                                        Employee employee = new Employee(ids, names, emails, genders, departments, salaryss);
                                        addEmployee(employee);
                                        JOptionPane.showMessageDialog(null, "Employee added");
                                        dispose();
                                        frame1.dispose();
                                    } catch (NumberFormatException ex) {
                                        JOptionPane.showMessageDialog(null, "Please enter a valid salary");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
                                }
                            }
                        });

                        frame1.add(Submit);
                        frame1.add(idLabel);
                        frame1.add(id);
                        frame1.add(nameLabel);
                        frame1.add(name);
                        frame1.add(emailLabel);
                        frame1.add(email);
                        frame1.add(genderLabel);
                        frame1.add(gender);
                        frame1.add(departmentLabel);
                        frame1.add(department);
                        frame1.add(salaryLabel);
                        frame1.add(salary);
                        frame1.setLayout(null);
                        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame1.setLocationRelativeTo(null);
                        frame1.setSize(420, 290);
                        frame1.setVisible(true);

                    }
                });
                JButton viewbutton = new JButton("ViewEmployee");
                viewbutton.setBounds(130, 0, 120, 40);
                viewbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame1 = null;
                        String id = JOptionPane.showInputDialog(null, "enter you id");

                        for (Employee employee : employees) {

                            if (employee.getId().equals(id)) {

                                frame1 = new JFrame("view data");
                                JTextArea textarea = new JTextArea();
                                textarea.setBounds(0, 0, 240, 220);
                                textarea.setText(employee.toString());
                                frame1.add(textarea);

                                frame1.setSize(240, 220);
                                frame1.setLayout(null);
                                frame1.setLocationRelativeTo(null);
                                frame1.setVisible(true);

                                return;
                            }
//                            else {
//                                JOptionPane.showMessageDialog(null, "Invalid id ", "Error", JOptionPane.ERROR_MESSAGE);
//                            }

                        }
                        JOptionPane.showMessageDialog(null, "Invalid id ", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                });

                viewbutton.setBackground(Color.BLACK);
                viewbutton.setForeground(Color.white);
                JButton UpdateButton = new JButton("UpdateEmployee");
                UpdateButton.setBounds(260, 0, 140, 40);
                UpdateButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String id = JOptionPane.showInputDialog(null, "Enter id");
                        for (Employee employee : employees) {
                            if (employee.getId().toString().equals(id)) {
                                String Salary = JOptionPane.showInputDialog(null, "Enter new Salary");
                                String loan = JOptionPane.showInputDialog(null, "Enter loan");
                                double newSalary = Double.parseDouble(Salary);
                                double NewLoan = Double.parseDouble(loan);

                                employee.setSalary(newSalary);
                                employee.setLoan(NewLoan);
                                return;
                            }
//                            else{
//                                JOptionPane.showMessageDialog(null,"Invalid id","Error",JOptionPane.ERROR_MESSAGE);
//                            }
                        }
                        JOptionPane.showMessageDialog(null,"Invalid id","Error",JOptionPane.ERROR_MESSAGE);


                    }
                });
                UpdateButton.setBackground(Color.BLACK);
                UpdateButton.setForeground(Color.white);
                JButton leaveButton = new JButton("AddLeave");
                leaveButton.setBounds(60, 70, 120, 40);
                leaveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame1 = new JFrame("Adding Leaves");
                        JTextField name = new JTextField();
                        name.setBounds(90, 40, 100, 25);
                        JTextField leaveType = new JTextField();
                        leaveType.setBounds(90, 70, 100, 25);
                        JTextField leavedate = new JTextField();
                        leavedate.setBounds(90, 100, 100, 25);dispose();dispose();

                        JLabel nameLabel = new JLabel("Name");
                        nameLabel.setBounds(20, 40, 70, 30);
                        JLabel leaveTypeLabel = new JLabel("Leavetype");
                        leaveTypeLabel.setBounds(20, 70, 70, 30);
                        JLabel leavedateLabel = new JLabel("LeaveDate");
                        leavedateLabel.setBounds(20, 100, 70, 30);

                        JButton Submit = new JButton("Submit");
                        Submit.setBounds(40, 150, 100, 35);
                        Submit.setBackground(Color.BLACK);
                        Submit.setForeground(Color.white);
                        Submit.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String Name = name.getText();
                                String LeaveType = leaveType.getText();
                                String leaveDate = leavedate.getText();

                                if (!Name.isEmpty() || !LeaveType.isEmpty() || !leaveDate.isEmpty()) {

                                    for (Employee employee : employees) {
                                        if (employee.getName().toString().equals(Name)) {
                                            EmployeeLeave employeeLeave = new EmployeeLeave(Name, LeaveType, leaveDate);
                                            addleave(employeeLeave);
                                            dispose();
                                            JOptionPane.showMessageDialog(null, "Leave added ");
                                            frame1.dispose();
                                            return;
                                        }
//                                        else
//                                            JOptionPane.showMessageDialog(null, "Employe Not Found", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                    JOptionPane.showMessageDialog(null, "Employe Not Found", "Error", JOptionPane.ERROR_MESSAGE);


                                } else
                                    JOptionPane.showMessageDialog(null, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        });


                        frame1.add(nameLabel);
                        frame1.add(name);
                        frame1.add(leaveTypeLabel);
                        frame1.add(leaveType);
                        frame1.add(leavedateLabel);
                        frame1.add(leavedate);
                        frame1.add(Submit);
                        frame1.setSize(400, 350);
                        frame1.setLayout(null);
                        frame1.setLocationRelativeTo(null);
                        frame1.setVisible(true);
                    }
                });
                leaveButton.setBackground(Color.BLACK);
                leaveButton.setForeground(Color.white);
                JButton viewLeave = new JButton("ViewLeave");
                viewLeave.setBounds(200, 70, 120, 40);
                viewLeave.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame1 = null;
                        String Name = JOptionPane.showInputDialog(null, "enter you Name");

                        for (EmployeeLeave employeeLeave : employeeLeaves) {

                            if (employeeLeave.getName().toString().equals(Name)) {
                                frame1 = new JFrame("view leave");
                                JTextArea textarea = new JTextArea();
                                textarea.setBounds(0, 0, 330, 280);
                                textarea.setText(employeeLeave.toString());
                                frame1.add(textarea);

                                frame1.setSize(330, 280);
                                frame1.setLayout(null);
                                frame1.setLocationRelativeTo(null);
                                frame1.setVisible(true);

                                return;
                            }
//                            else {
//                                JOptionPane.showMessageDialog(null, "Invalid Name ", "Error", JOptionPane.ERROR_MESSAGE);
//                            }
                        }
                        JOptionPane.showMessageDialog(null, "Invalid Name ", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                });

                viewLeave.setBackground(Color.BLACK);
                viewLeave.setForeground(Color.white);
                frame.add(pic1);
                frame.add(viewLeave);
                frame.add(leaveButton);
                frame.add(addEmployee);
                frame.add(viewbutton);
                frame.add(UpdateButton);
                frame.setLayout(null);
                frame.setSize(400, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect field enter", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == exit) {
            int JOptionPanes = JOptionPane.showConfirmDialog(null, "Do you want to exit", "confirm", JOptionPane.YES_NO_OPTION);
            if (JOptionPanes == JOptionPane.YES_OPTION) {
                System.exit(3);
            } else {
                setVisible(true);
            }

        }

    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Login login=new Login();

    }
}