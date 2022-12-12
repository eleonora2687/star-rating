package star.rating;

import java.util.ArrayList;
import java.util.List;

public class FrameRegistrationTest {

    ArrayList<String> username;


    public FrameRegistrationTest()
    {
        username=new ArrayList<>();

    }
    public void addUsername(String user)
    {
        if (!username.isEmpty())
        {
            for (int i = 0; i < username.size(); i++)
            {
                if (this.username.contains(user))
                    break;

                else
                    this.username.add(user);

            }
        }
        else this.username.add(user);

    }


    public List<String> getUsername()
    {
        return username;
    }

}
