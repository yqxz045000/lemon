package com.mossle.asset.persistence.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * AssetCategory .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "ASSET_CATEGORY")
public class AssetCategory implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private AssetCategory assetCategory;

    /** null. */
    private String name;

    /** null. */
    private String code;

    /** null. */
    private String description;

    /** . */
    private Set<AssetInfo> assetInfosForCategoryId = new HashSet<AssetInfo>(0);

    /** . */
    private Set<AssetCategory> assetCategories = new HashSet<AssetCategory>(0);

    /** . */
    private Set<AssetInfo> assetInfosForSubCategoryId = new HashSet<AssetInfo>(
            0);

    public AssetCategory() {
    }

    public AssetCategory(Long id) {
        this.id = id;
    }

    public AssetCategory(Long id, AssetCategory assetCategory, String name,
            String code, String description,
            Set<AssetInfo> assetInfosForCategoryId,
            Set<AssetCategory> assetCategories,
            Set<AssetInfo> assetInfosForSubCategoryId) {
        this.id = id;
        this.assetCategory = assetCategory;
        this.name = name;
        this.code = code;
        this.description = description;
        this.assetInfosForCategoryId = assetInfosForCategoryId;
        this.assetCategories = assetCategories;
        this.assetInfosForSubCategoryId = assetInfosForSubCategoryId;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    public AssetCategory getAssetCategory() {
        return this.assetCategory;
    }

    /**
     * @param assetCategory
     *            null.
     */
    public void setAssetCategory(AssetCategory assetCategory) {
        this.assetCategory = assetCategory;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "CODE", length = 200)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            null.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "assetCategoryByCategoryId")
    public Set<AssetInfo> getAssetInfosForCategoryId() {
        return this.assetInfosForCategoryId;
    }

    /**
     * @param assetInfosForCategoryId
     *            .
     */
    public void setAssetInfosForCategoryId(
            Set<AssetInfo> assetInfosForCategoryId) {
        this.assetInfosForCategoryId = assetInfosForCategoryId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "assetCategory")
    public Set<AssetCategory> getAssetCategories() {
        return this.assetCategories;
    }

    /**
     * @param assetCategories
     *            .
     */
    public void setAssetCategories(Set<AssetCategory> assetCategories) {
        this.assetCategories = assetCategories;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "assetCategoryBySubCategoryId")
    public Set<AssetInfo> getAssetInfosForSubCategoryId() {
        return this.assetInfosForSubCategoryId;
    }

    /**
     * @param assetInfosForSubCategoryId
     *            .
     */
    public void setAssetInfosForSubCategoryId(
            Set<AssetInfo> assetInfosForSubCategoryId) {
        this.assetInfosForSubCategoryId = assetInfosForSubCategoryId;
    }
}
