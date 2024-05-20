package Menu_Admin_3.DonHang;

import java.text.DecimalFormat;
import javax.swing.Icon;

public class ModelStudent {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(String fees) {
        this.total = total;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String fees) {
        this.time = time;
    }

    public ModelStudent(Icon icon, String name, String gender, String course, String fees, Double total,String time) {
        this.icon = icon;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.fees = fees;
        this.total = total;
        this.time = time;
    }

    public ModelStudent() {
    }

    private Icon icon;
    private String name;
    private String gender;
    private String course;
    private String fees;
    private double total;
    private String time;

    public Object[] toRowTable(EventAction event) {
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        return new Object[]{new ModelProfile(icon, name), gender, course, fees,df.format(total),time, new ModelAction(this, event) };
    }
}
