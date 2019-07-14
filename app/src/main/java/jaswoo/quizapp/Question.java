package jaswoo.quizapp;

public class Question {
    private int mTextResId;
    private int mHintTextResId;


    public Question(int textResId, int hintTextResId) {
        mTextResId = textResId;
        mHintTextResId = hintTextResId;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public int getHintTextResId()
    {
        return mHintTextResId;
    }

    public void setHintTextResId(int hintTextResId)
    {
        mHintTextResId = hintTextResId;
    }

    public boolean checkAnswer(boolean boolResponse) {
        return false;
    }

    public boolean checkAnswer(String userAnswer) {
        return false;
    }

    //stub method; call this method to determine whether question is a TF question
    //Read more on STUBS
    public boolean isTrueFalseQuestion()
    {
        return false;
    }
    public boolean isFillTheBlankQuestion()
    {
        return false;
    }

    public boolean isMultipleChoiceQuestion()
    {
        return false;
    }

}
