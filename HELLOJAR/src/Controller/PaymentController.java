package Controller;

import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentController {
    private Scanner scanner;
    private Invoice invoice;
    private Student student;
    private Rule rule;
    private int indexSubject;
    private Subject subject;
    private ArrayList<Subject> subjectArrayList;
    private float total;
    public PaymentController(){
        Init();
        Input();
        Solve();

    }

    public Invoice getInvoice() {
        return this.invoice;
    }

    private void Init(){
        scanner = new Scanner(System.in);
        student = new Student();
        rule = new Rule();

        subjectArrayList = new ArrayList<>();
        total = 0f;
    }

    private  void Input() {
        student.setCode(scanner.nextLine());
        student.setName(scanner.nextLine());
        indexSubject = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= indexSubject; ++i){
            subject = new Subject();
            subject.setCode(scanner.nextLine());
            subject.setName(scanner.nextLine());
            subject.setCredit(Integer.parseInt(scanner.nextLine()));
            subjectArrayList.add(subject);

        }
        rule.setCode(scanner.nextLine());
        rule.setName(scanner.nextLine());
        rule.setCreditPrice(Integer.parseInt(scanner.nextLine()));
    }

    private void Solve() {
        for(Subject subject1 : subjectArrayList){
            total += (float) (subject1.getCredit() * rule.getCreditPrice());
        }
        invoice = new Invoice(rule);
        invoice.setAmount(total);
        invoice.setSt(student);
        invoice.setAlSubject(subjectArrayList);
    }


}
