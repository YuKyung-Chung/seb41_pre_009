package stackoverflow.question.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import stackoverflow.audit.Auditable;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Question extends Auditable{
    //ToDo
        //Member-Question 1:N 매핑하기
        //Question-Answer 1:N 매핑하기
        //Question-Vote 1:1 매핑하기

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    //memberId는 Member 테이블과 매핑하면서 가져오기

    @Column(nullable = false)
    @Size(min = 15, max = 150)
    private String title;

    @Column(nullable = false)
    @Size(min = 30)
    private String content;

    @Column
    private Integer view; //null 허용 여부 논의하기

    public Question(String title, String content, Integer view) {
        this.title = title;
        this.content = content;
        this.view = view;
    }
}