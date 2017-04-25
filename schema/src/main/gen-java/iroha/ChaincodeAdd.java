// automatically generated by the FlatBuffers compiler, do not modify

package iroha;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ChaincodeAdd extends Table {
  public static ChaincodeAdd getRootAsChaincodeAdd(ByteBuffer _bb) { return getRootAsChaincodeAdd(_bb, new ChaincodeAdd()); }
  public static ChaincodeAdd getRootAsChaincodeAdd(ByteBuffer _bb, ChaincodeAdd obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public ChaincodeAdd __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int code(int j) { int o = __offset(4); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int codeLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer codeAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public iroha.Chaincode ChaincodeAsIroha() { return ChaincodeAsIroha(new iroha.Chaincode()); }
  public iroha.Chaincode ChaincodeAsIroha(iroha.Chaincode obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o)), bb) : null; }

  public static int createChaincodeAdd(FlatBufferBuilder builder,
      int codeOffset) {
    builder.startObject(1);
    ChaincodeAdd.addCode(builder, codeOffset);
    return ChaincodeAdd.endChaincodeAdd(builder);
  }

  public static void startChaincodeAdd(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addCode(FlatBufferBuilder builder, int codeOffset) { builder.addOffset(0, codeOffset, 0); }
  public static int createCodeVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startCodeVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endChaincodeAdd(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // code
    return o;
  }
}

