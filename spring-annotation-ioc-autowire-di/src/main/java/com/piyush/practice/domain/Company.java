package com.piyush.practice.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

/**
 * Created by pkumar on 8/26/17.
 */
public class Company {

    @Autowired
    private  Employee employee;

    private int companyId;
    private String name;
    private Employee[] employees;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        this.setEmployees(employee);
        return employees;
    }

    private void setEmployees(Employee... employees) {
        this.employees = employees;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (companyId != company.companyId) return false;
        if (employee != null ? !employee.equals(company.employee) : company.employee != null) return false;
        if (name != null ? !name.equals(company.name) : company.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        int result = employee != null ? employee.hashCode() : 0;
        result = 31 * result + companyId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employee=" + employee +
                ", companyId=" + companyId +
                ", name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
