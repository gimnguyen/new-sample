
import org.apache.log4j.Logger;
import org.graphwalker.Util;
import org.graphwalker.generators.PathGenerator;

public class ModelAPI extends org.graphwalker.multipleModels.ModelAPI {
  private static Logger logger = Util.setupLogger(ModelAPI.class);

  public ModelAPI(File model, boolean efsm, PathGenerator generator, boolean weight) {
    super(model, efsm, generator, weight);
  }


  /**
   * This method implements the {EDGE_VERTEX} 'e_1Action'
   * {DESCRIPTION}
   */
  public void e_1Action() {
  }


  /**
   * This method implements the {EDGE_VERTEX} 'e_SomeAction2'
   * {DESCRIPTION}
   */
  public void e_SomeAction2() {
  }


  /**
   * This method implements the {EDGE_VERTEX} 'e_SomeAction3'
   * {DESCRIPTION}
   */
  public void e_SomeAction3() {
  }


  /**
   * This method implements the {EDGE_VERTEX} 'e_firstAction'
   * {DESCRIPTION}
   */
  public void e_firstAction() {
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_VeifySomeAction2'
   * {DESCRIPTION}
   */
  public void v_VeifySomeAction2() {
  }


  /**
   * This method implements the {EDGE_VERTEX} 'v_VerifySomeAction'
   * {DESCRIPTION}
   */
  public void v_VerifySomeAction() {
  }


}

