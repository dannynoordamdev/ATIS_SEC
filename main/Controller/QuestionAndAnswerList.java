import java.util.ArrayList;

public class QuestionAndAnswerList {
    private ArrayList<QuestionAndAnswer> questionAndAnswerList = new ArrayList<>();

    public void addQuestion(QuestionAndAnswer question) {
        questionAndAnswerList.add(question);
    }

    public ArrayList<QuestionAndAnswer> getQuestionAndAnswerList() {
        return questionAndAnswerList;
    }

}
