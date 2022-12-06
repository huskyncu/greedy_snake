package a10_109502517;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class GreedySnakeController implements EventHandler<KeyEvent>{
	int rowIndex=0;
	int columnIndex=0;
	int a,b;
	boolean c=true,d=true,en=true;
    @FXML
    private GridPane gridpane;

    @FXML
    private Pane pane44;

    @FXML
    private Pane pane00;
    
    @FXML
    private Pane formerpane;

    @FXML
    private Text Label;

    @FXML
    private Button back;

    @FXML
    void back(ActionEvent event) {
    	A10.currentStage.setScene(A10.menuScene);
    }

    @FXML
    public void handle(KeyEvent e) {
    	c=true;
    	d=true;
    	a=rowIndex;
    	b=columnIndex;
    	 if(e.getCode()==KeyCode.SPACE)
     	{
    		en=true;
    		Label.setVisible(false);
    		pane00.setVisible(true);
     		rowIndex=0;
     		columnIndex=0;
     		GridPane.setRowIndex(pane00,0);
     		GridPane.setRowIndex(formerpane, 0);
     		GridPane.setColumnIndex(pane00, 0);
     		GridPane.setColumnIndex(formerpane, 0);
     	}
    	 else if(en){
    		 if(e.getCode()==KeyCode.UP)
    	    	{
    	    		rowIndex--;
    	    		if(rowIndex==-1)
    	    			d=false;
    	    	}
    	    	else if (e.getCode()==KeyCode.DOWN)
    	    	{
    	    		rowIndex++;
    	    		if(rowIndex==gridpane.getRowCount())
    	    			d=false;
    	    	}
    	    	else if(e.getCode()==KeyCode.LEFT)
    	    	{
    	    		columnIndex--;
    	    		if(columnIndex==-1)
    	    			d=false;
    	    	}
    	    	else if(e.getCode()==KeyCode.RIGHT)
    	    	{
    	    		columnIndex++;
    	    		if(columnIndex==gridpane.getColumnCount())
    	    			d=false;
    	    	}
    	    		previous();
    	        	walkToNewPosition();
    	 }
    	int exitRowIndex = GridPane.getRowIndex(pane44);
    	int exitColumnIndex=GridPane.getColumnIndex(pane44);
    	if(rowIndex==exitRowIndex && columnIndex==exitColumnIndex)
    	{
    		c=false;
    		Label.setText("移動到出口了!");
    		Label.setVisible(true);
    		pane00.setVisible(false);
    		en=false;
    	}
    }
    	private void walkToNewPosition()
    	{
    	    int maxRowIndex=gridpane.getRowCount()-1;
    		int maxColumnIndex=gridpane.getColumnCount()-1;
    		if(rowIndex<0)
    		{
    			rowIndex=0;
    			Label.setVisible(true);
    			Label.setText("你輸了!");
    			en=false;
    		}
    		if(rowIndex>maxRowIndex)
    		{
    			rowIndex=maxRowIndex;
    			Label.setVisible(true);
    			Label.setText("你輸了!");
    			en=false;
    		}
    		if(columnIndex<0)
    		{
    			columnIndex=0;
    			Label.setVisible(true);
    			Label.setText("你輸了!");
    			en=false;
    		}
    		if(columnIndex>maxColumnIndex)
    		{
    			columnIndex=maxColumnIndex;
    			Label.setVisible(true);
    			Label.setText("你輸了!");
    			en=false;
    		}
    		GridPane.setRowIndex(pane00,rowIndex);
    		GridPane.setColumnIndex(pane00, columnIndex);
    }
    	private void previous()
    	{
    		if(c && d)
    		{
    			GridPane.setRowIndex(formerpane,a);
        		GridPane.setColumnIndex(formerpane, b);
    		}
    	}
}