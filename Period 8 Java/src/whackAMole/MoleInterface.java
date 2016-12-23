package whackAMole;

import guiPratice.components.Action;
import guiPratice.components.Clickable;

public interface MoleInterface extends Clickable{

	int getAppearanceTime();

	void setAppearanceTime(int i);

	void setAction(Action action);


}
