package model;

import java.time.LocalDate;

public class loan extends Entity{
    private book book;
    private user user;
    private LocalDate loanDate, devolutionDate;
    private boolean returned;

    public loan(int id, model.book book, model.user user, LocalDate loanDate, LocalDate devolutionDate, boolean returned) {
        super(id);
        this.book = book;
        this.user = user;
        this.loanDate = loanDate;
        this.devolutionDate = devolutionDate;
        this.returned = returned;
    }

    public book getBook() {
        return book;
    }

    public void setBook(book book) {
        this.book = book;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(LocalDate devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public void returnBook(){
        this.devolutionDate =  LocalDate.now();
        this.returned = true;
        this.book.setDisponibility(true);

    }

    @Override
    public String toString() {
        return "Loan{" +
                "Book=" + book +
                ", User=" + user +
                ", Date=" + loanDate +
                ", Devolution Date=" + devolutionDate +
                ", Returned=" + returned +
                '}';
    }
}