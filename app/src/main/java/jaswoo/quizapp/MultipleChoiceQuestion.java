package jaswoo.quizapp;

public class MultipleChoiceQuestion extends Question
{
    private int mOptionsResId;
    private int mAnswer;


    public MultipleChoiceQuestion(int textResId, int hintResId, int optionsResId, int ans)
    {
        super(textResId, hintResId);
        mOptionsResId = optionsResId;
        mAnswer = ans;
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

    public int getOptionsResId()
    {
        return mOptionsResId;
    }

    @Override
    public boolean isMultipleChoiceQuestion()
    {
        return true;
    }
}

