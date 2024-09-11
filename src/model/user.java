package model;

import java.util.ArrayList;
import java.util.List;

public class user extends Entity {
    private String name;
    private String lastName;
    private String email;
    private List<String> loanHistory;
    private int sanctions;

    // Constructor
    public user(int id, String name, String lastName, String email) {
        super(id);
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.loanHistory = new ArrayList<>();
        this.sanctions = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }

    public List<String> getLoanHistory() {
        return loanHistory;
    }

    public void setLoanHistory(List<String> loanHistory) {
        if (loanHistory != null) {
            this.loanHistory = loanHistory;
        }
    }

    public int getSanctions() {
        return sanctions;
    }

    // Validation methods
    public void addLoan(String loan) {
        if (loan != null) {
            this.loanHistory.add(loan);
        }
    }

    public void incrementSanctions() {
        this.sanctions++;
    }

    public void clearSanctions() {
        this.sanctions = 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + name + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Email='" + email + '\'' +
                ", Loan History=" + loanHistory +
                ", Sanctions=" + sanctions +
                '}';
    }
}