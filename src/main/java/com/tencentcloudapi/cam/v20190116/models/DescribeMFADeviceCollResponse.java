/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMFADeviceCollResponse extends AbstractModel{

    /**
    * Token状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Token值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenSn")
    @Expose
    private String TokenSn;

    /**
    * token类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenType")
    @Expose
    private Long TokenType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Token状态 
     * @return Status Token状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Token状态
     * @param Status Token状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Token值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenSn Token值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTokenSn() {
        return this.TokenSn;
    }

    /**
     * Set Token值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenSn Token值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenSn(String TokenSn) {
        this.TokenSn = TokenSn;
    }

    /**
     * Get token类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenType token类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTokenType() {
        return this.TokenType;
    }

    /**
     * Set token类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenType token类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenType(Long TokenType) {
        this.TokenType = TokenType;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TokenSn", this.TokenSn);
        this.setParamSimple(map, prefix + "TokenType", this.TokenType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
