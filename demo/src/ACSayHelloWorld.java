

import javax.swing.JOptionPane;

import tr.edu.ege.seagent.planner.htn.Action;
import tr.edu.ege.seagent.planner.htn.ExecutionMethod;

/**
* Action class of ACSayHelloWorld.
*/
public class ACSayHelloWorld extends Action {

	/**
	 * Execution method.
	 */
	@ExecutionMethod 
	public void execute(){
		JOptionPane.showMessageDialog(null, "Hello World from ÖZGE!");
	}

}

