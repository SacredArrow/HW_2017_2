package plugins;

import com.company.Command;
import com.company.Intellect;

public class CarefulIntellect extends Intellect {
    @Override
    public Command decide(int score) {

        return Command.STAND;
    }
}
