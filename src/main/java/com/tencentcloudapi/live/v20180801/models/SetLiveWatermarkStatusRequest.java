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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetLiveWatermarkStatusRequest  extends AbstractModel{

    /**
    * 水印ID。
    */
    @SerializedName("WatermarkId")
    @Expose
    private Integer WatermarkId;

    /**
    * 状态。0：停用，1:启用
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
     * 获取水印ID。
     * @return WatermarkId 水印ID。
     */
    public Integer getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * 设置水印ID。
     * @param WatermarkId 水印ID。
     */
    public void setWatermarkId(Integer WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    /**
     * 获取状态。0：停用，1:启用
     * @return Status 状态。0：停用，1:启用
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态。0：停用，1:启用
     * @param Status 状态。0：停用，1:启用
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WatermarkId", this.WatermarkId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

