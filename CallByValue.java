class CallByValue {
  int a;
  public void update(CallByValue cv){
    cv.a = cv.a + 20;
  }
}