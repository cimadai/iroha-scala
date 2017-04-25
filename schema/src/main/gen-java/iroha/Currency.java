// automatically generated by the FlatBuffers compiler, do not modify

package iroha;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Currency extends Table {
  public static Currency getRootAsCurrency(ByteBuffer _bb) { return getRootAsCurrency(_bb, new Currency()); }
  public static Currency getRootAsCurrency(ByteBuffer _bb, Currency obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Currency __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String currencyName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer currencyNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String domainName() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer domainNameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String ledgerName() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer ledgerNameAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String description() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer descriptionAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public long amount() { int o = __offset(12); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public int precision() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static int createCurrency(FlatBufferBuilder builder,
      int currency_nameOffset,
      int domain_nameOffset,
      int ledger_nameOffset,
      int descriptionOffset,
      long amount,
      int precision) {
    builder.startObject(6);
    Currency.addAmount(builder, amount);
    Currency.addDescription(builder, descriptionOffset);
    Currency.addLedgerName(builder, ledger_nameOffset);
    Currency.addDomainName(builder, domain_nameOffset);
    Currency.addCurrencyName(builder, currency_nameOffset);
    Currency.addPrecision(builder, precision);
    return Currency.endCurrency(builder);
  }

  public static void startCurrency(FlatBufferBuilder builder) { builder.startObject(6); }
  public static void addCurrencyName(FlatBufferBuilder builder, int currencyNameOffset) { builder.addOffset(0, currencyNameOffset, 0); }
  public static void addDomainName(FlatBufferBuilder builder, int domainNameOffset) { builder.addOffset(1, domainNameOffset, 0); }
  public static void addLedgerName(FlatBufferBuilder builder, int ledgerNameOffset) { builder.addOffset(2, ledgerNameOffset, 0); }
  public static void addDescription(FlatBufferBuilder builder, int descriptionOffset) { builder.addOffset(3, descriptionOffset, 0); }
  public static void addAmount(FlatBufferBuilder builder, long amount) { builder.addLong(4, amount, 0L); }
  public static void addPrecision(FlatBufferBuilder builder, int precision) { builder.addByte(5, (byte)precision, (byte)0); }
  public static int endCurrency(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // currency_name
    builder.required(o, 6);  // domain_name
    builder.required(o, 8);  // ledger_name
    return o;
  }

  @Override
  protected int keysCompare(Integer o1, Integer o2, ByteBuffer _bb) { return compareStrings(__offset(4, o1, _bb), __offset(4, o2, _bb), _bb); }

  public static Currency lookupByKey(int vectorOffset, String key, ByteBuffer bb) {
    byte[] byteKey = key.getBytes(Table.UTF8_CHARSET.get());
    int vectorLocation = bb.array().length - vectorOffset;
    int span = bb.getInt(vectorLocation);
    int start = 0;
    vectorLocation += 4;
    while (span != 0) {
      int middle = span / 2;
      int tableOffset = __indirect(vectorLocation + 4 * (start + middle), bb);
      int comp = compareStrings(__offset(4, bb.array().length - tableOffset, bb), byteKey, bb);
      if (comp > 0) {
        span = middle;
      } else if (comp < 0) {
        middle++;
        start += middle;
        span -= middle;
      } else {
        return new Currency().__assign(tableOffset, bb);
      }
    }
    return null;
  }
}

