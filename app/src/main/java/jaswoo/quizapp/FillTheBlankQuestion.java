package jaswoo.quizapp;

public class FillTheBlankQuestion extends Question
{
    private String[] mFillAnswers;

    public FillTheBlankQuestion(int textResId, int hintTextResId, String[] fillAnswers)
    {
        super(textResId, hintTextResId);
        mFillAnswers = fillAnswers;
    }
    public boolean checkAnswer(String userAnswer)
    {
        boolean foundAnswer = false;

        for (String ans : mFillAnswers)
        {
            if (ans.equalsIgnoreCase(userAnswer))
            {
                return true;
            }
        }
        return false;

    }
    public boolean isFillTheBlankQuestion()
    {
        return true;
    }
}
