package jaswoo.quizapp;

public class MultipleChoiceQuestion extends Question
{
    private int mAnswer;
    private String[] mOptions;

    public MultipleChoiceQuestion(int String text, int String[] getOptions, int answer)
    {
        super(textResId, hintResId);
        mAnswer = answer;
    }

    @Override
    public boolean checkAnswer(int answer)
    {
        boolean foundAnswer = false;
        if (mAnswer == answer)
        {
            return true;
        }
        return false;
    }

    public String[] getOptions()
    {
        return mOptions;
    }
    public boolean isMultipleChoiceQuestion()
    {
        return true;
    }
    @Override
    public boolean checkAnswer(int ans)
    {
        return mAnswer == ans;
    }
}

