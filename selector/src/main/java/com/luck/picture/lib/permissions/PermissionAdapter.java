package com.luck.picture.lib.permissions;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.luck.picture.lib.R;

import java.util.ArrayList;

public class PermissionAdapter extends RecyclerView.Adapter<PermissionAdapter.PermissionHolder> {
    private ArrayList<PermissionBean> list = new ArrayList<PermissionBean>();

    public PermissionAdapter() {
        list.add(new PermissionBean(R.mipmap.permission_icon_camera, "相机", "允许应用获取相机权限,用于扫码识别。"));
        list.add(new PermissionBean(R.mipmap.permission_icon_album, "相册", "允许应用获取相册权限,用于相册选择图片、更新头像。"));
        list.add(new PermissionBean(R.mipmap.permission_icon_storge, "存储", "允许应用获取存储权限,用于图片拍照保存、更新头像。"));
    }

    @NonNull
    @Override
    public PermissionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PermissionHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.ps_dialog_list_item_permission, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PermissionHolder holder, int position) {
        PermissionBean bean = list.get(position);
        holder.ivIcon.setImageResource(bean.getIcon());
        holder.tvName.setText(bean.getName());
        holder.tvDesc.setText(bean.getDesc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class PermissionHolder extends RecyclerView.ViewHolder {
        ImageView ivIcon;
        TextView tvName;
        TextView tvDesc;
        public PermissionHolder(View view) {
            super(view);
            ivIcon = view.findViewById(R.id.ivIcon);
            tvName = view.findViewById(R.id.tvName);
            tvDesc = view.findViewById(R.id.tvDesc);
        }
    }
}
