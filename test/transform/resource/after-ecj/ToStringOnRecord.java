import lombok.ToString;
@ToString record ToStringOnRecord(String a, String b) {
/* Implicit */  private final String a;
/* Implicit */  private final String b;
  public ToStringOnRecord(String a, String b) {
    super();
    .a = a;
    .b = b;
  }
}