package oracle.sql;


/**
 * Dummy {@code TIMESTAMPTZ} interface which avoids a dependency to OJDBC.
 */
public class TIMESTAMPTZ {

  private byte[] timestamptz;

  public TIMESTAMPTZ(byte[] timestamptz) {
    this.timestamptz = timestamptz;
  }

  public TIMESTAMPTZ() {
    this.timestamptz = new byte[13];
  }

  public byte[] toBytes() {
    return this.timestamptz;
  }

}
