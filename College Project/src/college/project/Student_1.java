/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college.project;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mohamad Sobhy
 */
@Entity
@Table(name = "student", catalog = "college", schema = "")
@NamedQueries({
    @NamedQuery(name = "Student_1.findAll", query = "SELECT s FROM Student_1 s"),
    @NamedQuery(name = "Student_1.findByStudentID", query = "SELECT s FROM Student_1 s WHERE s.studentID = :studentID"),
    @NamedQuery(name = "Student_1.findByFname", query = "SELECT s FROM Student_1 s WHERE s.fname = :fname"),
    @NamedQuery(name = "Student_1.findBySname", query = "SELECT s FROM Student_1 s WHERE s.sname = :sname"),
    @NamedQuery(name = "Student_1.findByLname", query = "SELECT s FROM Student_1 s WHERE s.lname = :lname"),
    @NamedQuery(name = "Student_1.findByAddress", query = "SELECT s FROM Student_1 s WHERE s.address = :address"),
    @NamedQuery(name = "Student_1.findByEMail", query = "SELECT s FROM Student_1 s WHERE s.eMail = :eMail"),
    @NamedQuery(name = "Student_1.findByPhoneNum", query = "SELECT s FROM Student_1 s WHERE s.phoneNum = :phoneNum"),
    @NamedQuery(name = "Student_1.findByGender", query = "SELECT s FROM Student_1 s WHERE s.gender = :gender"),
    @NamedQuery(name = "Student_1.findByBirthDate", query = "SELECT s FROM Student_1 s WHERE s.birthDate = :birthDate"),
    @NamedQuery(name = "Student_1.findByStuyear", query = "SELECT s FROM Student_1 s WHERE s.stuyear = :stuyear"),
    @NamedQuery(name = "Student_1.findBySsn", query = "SELECT s FROM Student_1 s WHERE s.ssn = :ssn")})
public class Student_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Student_ID")
    private Integer studentID;
    @Basic(optional = false)
    @Column(name = "Fname")
    private String fname;
    @Basic(optional = false)
    @Column(name = "Sname")
    private String sname;
    @Basic(optional = false)
    @Column(name = "Lname")
    private String lname;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "E_Mail")
    private String eMail;
    @Basic(optional = false)
    @Column(name = "Phone_Num")
    private int phoneNum;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "Birth_Date")
    private String birthDate;
    @Basic(optional = false)
    @Column(name = "Stu_year")
    private String stuyear;
    @Basic(optional = false)
    @Column(name = "SSN")
    private String ssn;

    public Student_1() {
    }

    public Student_1(Integer studentID) {
        this.studentID = studentID;
    }

    public Student_1(Integer studentID, String fname, String sname, String lname, String address, String eMail, int phoneNum, String gender, String birthDate, String stuyear, String ssn) {
        this.studentID = studentID;
        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
        this.address = address;
        this.eMail = eMail;
        this.phoneNum = phoneNum;
        this.gender = gender;
        this.birthDate = birthDate;
        this.stuyear = stuyear;
        this.ssn = ssn;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        Integer oldStudentID = this.studentID;
        this.studentID = studentID;
        changeSupport.firePropertyChange("studentID", oldStudentID, studentID);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        String oldSname = this.sname;
        this.sname = sname;
        changeSupport.firePropertyChange("sname", oldSname, sname);
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        String oldLname = this.lname;
        this.lname = lname;
        changeSupport.firePropertyChange("lname", oldLname, lname);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        String oldEMail = this.eMail;
        this.eMail = eMail;
        changeSupport.firePropertyChange("EMail", oldEMail, eMail);
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        int oldPhoneNum = this.phoneNum;
        this.phoneNum = phoneNum;
        changeSupport.firePropertyChange("phoneNum", oldPhoneNum, phoneNum);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        String oldBirthDate = this.birthDate;
        this.birthDate = birthDate;
        changeSupport.firePropertyChange("birthDate", oldBirthDate, birthDate);
    }

    public String getStuyear() {
        return stuyear;
    }

    public void setStuyear(String stuyear) {
        String oldStuyear = this.stuyear;
        this.stuyear = stuyear;
        changeSupport.firePropertyChange("stuyear", oldStuyear, stuyear);
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        String oldSsn = this.ssn;
        this.ssn = ssn;
        changeSupport.firePropertyChange("ssn", oldSsn, ssn);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentID != null ? studentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student_1)) {
            return false;
        }
        Student_1 other = (Student_1) object;
        if ((this.studentID == null && other.studentID != null) || (this.studentID != null && !this.studentID.equals(other.studentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "college.project.Student_1[ studentID=" + studentID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
