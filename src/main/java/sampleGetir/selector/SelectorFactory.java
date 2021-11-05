package sampleGetir.selector;

public class SelectorFactory {

  private SelectorFactory() {

  }

  public static sampleGetir.selector.Selector createElementHelper(SelectorType selectorType) {
    sampleGetir.selector.Selector elementHelper = null;
    if (selectorType == SelectorType.ANDROID) {
      elementHelper = new sampleGetir.selector.AndroidSelector();
    }
    return elementHelper;
  }
}
