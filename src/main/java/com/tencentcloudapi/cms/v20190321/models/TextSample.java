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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextSample extends AbstractModel{

    /**
    * 处理错误码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 关键词
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 创建时间戳
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20105：广告引流 
24001：暴恐
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 唯一标识
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 样本类型
1：黑库
2：白库
    */
    @SerializedName("Label")
    @Expose
    private Long Label;

    /**
    * 任务状态
1：已完成
2：处理中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 处理错误码 
     * @return Code 处理错误码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 处理错误码
     * @param Code 处理错误码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 关键词 
     * @return Content 关键词
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 关键词
     * @param Content 关键词
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 创建时间戳 
     * @return CreatedAt 创建时间戳
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间戳
     * @param CreatedAt 创建时间戳
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20105：广告引流 
24001：暴恐 
     * @return EvilType 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20105：广告引流 
24001：暴恐
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20105：广告引流 
24001：暴恐
     * @param EvilType 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20105：广告引流 
24001：暴恐
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 唯一标识 
     * @return Id 唯一标识
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 唯一标识
     * @param Id 唯一标识
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 样本类型
1：黑库
2：白库 
     * @return Label 样本类型
1：黑库
2：白库
     */
    public Long getLabel() {
        return this.Label;
    }

    /**
     * Set 样本类型
1：黑库
2：白库
     * @param Label 样本类型
1：黑库
2：白库
     */
    public void setLabel(Long Label) {
        this.Label = Label;
    }

    /**
     * Get 任务状态
1：已完成
2：处理中 
     * @return Status 任务状态
1：已完成
2：处理中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
1：已完成
2：处理中
     * @param Status 任务状态
1：已完成
2：处理中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

