// automatically generated by the FlatBuffers compiler, do not modify

package iroha;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ComplexAsset extends Table {
  public static ComplexAsset getRootAsComplexAsset(ByteBuffer _bb) { return getRootAsComplexAsset(_bb, new ComplexAsset()); }
  public static ComplexAsset getRootAsComplexAsset(ByteBuffer _bb, ComplexAsset obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public ComplexAsset __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String assetName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer assetNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String domainName() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer domainNameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String ledgerName() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer ledgerNameAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String description() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer descriptionAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public iroha.KeyValueObject prop(int j) { return prop(new iroha.KeyValueObject(), j); }
  public iroha.KeyValueObject prop(iroha.KeyValueObject obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int propLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public ComplexAssetLogic logic() { return logic(new ComplexAssetLogic()); }
  public ComplexAssetLogic logic(ComplexAssetLogic obj) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createComplexAsset(FlatBufferBuilder builder,
      int asset_nameOffset,
      int domain_nameOffset,
      int ledger_nameOffset,
      int descriptionOffset,
      int propOffset,
      int logicOffset) {
    builder.startObject(6);
    ComplexAsset.addLogic(builder, logicOffset);
    ComplexAsset.addProp(builder, propOffset);
    ComplexAsset.addDescription(builder, descriptionOffset);
    ComplexAsset.addLedgerName(builder, ledger_nameOffset);
    ComplexAsset.addDomainName(builder, domain_nameOffset);
    ComplexAsset.addAssetName(builder, asset_nameOffset);
    return ComplexAsset.endComplexAsset(builder);
  }

  public static void startComplexAsset(FlatBufferBuilder builder) { builder.startObject(6); }
  public static void addAssetName(FlatBufferBuilder builder, int assetNameOffset) { builder.addOffset(0, assetNameOffset, 0); }
  public static void addDomainName(FlatBufferBuilder builder, int domainNameOffset) { builder.addOffset(1, domainNameOffset, 0); }
  public static void addLedgerName(FlatBufferBuilder builder, int ledgerNameOffset) { builder.addOffset(2, ledgerNameOffset, 0); }
  public static void addDescription(FlatBufferBuilder builder, int descriptionOffset) { builder.addOffset(3, descriptionOffset, 0); }
  public static void addProp(FlatBufferBuilder builder, int propOffset) { builder.addOffset(4, propOffset, 0); }
  public static int createPropVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPropVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addLogic(FlatBufferBuilder builder, int logicOffset) { builder.addOffset(5, logicOffset, 0); }
  public static int endComplexAsset(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // asset_name
    builder.required(o, 6);  // domain_name
    builder.required(o, 8);  // ledger_name
    return o;
  }

  @Override
  protected int keysCompare(Integer o1, Integer o2, ByteBuffer _bb) { return compareStrings(__offset(4, o1, _bb), __offset(4, o2, _bb), _bb); }

  public static ComplexAsset lookupByKey(int vectorOffset, String key, ByteBuffer bb) {
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
        return new ComplexAsset().__assign(tableOffset, bb);
      }
    }
    return null;
  }
}

