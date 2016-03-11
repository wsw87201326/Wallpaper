package com.wsw.wallpaper.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.wsw.wallpaper.R;
import com.wsw.wallpaper.entities.PageEntity;
import com.wsw.wallpaper.entities.PicturePageEntity;
import com.wsw.wallpaper.ui.ImageClickListener;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Create By :wsw
 * 2016-03-11 15:58
 */
public class ImageRecyclerAdapter extends RecyclerView.Adapter<ImageRecyclerAdapter.ImageViewHolder> {

    private final PageEntity page;
    private final Context mContext;
    private final ImageClickListener imageClickListener;

    public ImageRecyclerAdapter(PageEntity page, Context mContext, ImageClickListener imageClickListener) {
        this.page = page;
        this.mContext = mContext;
        this.imageClickListener = imageClickListener;
    }


    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(mContext).inflate(
                R.layout.item_image, parent, false);
        return new ImageViewHolder(rootView, imageClickListener);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        holder.bindImage(page.getPicturePageEntity().getList().get(position));
    }

    @Override
    public int getItemCount() {
        return this.page.getTotalItemNum();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.item_image_view)
        ImageView itemImageView;

        public ImageViewHolder(View itemView, final ImageClickListener imageClickListener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            bindListener(itemView, imageClickListener);
        }

        public void bindImage(PicturePageEntity.PictureEntity pictureEntity) {
            Glide.with(mContext)
                    .load(pictureEntity.getThumb())
                    .crossFade()
                    .into(itemImageView);
        }

        private void bindListener(View itemView, final ImageClickListener imageClickListener) {
            itemView.setOnClickListener(v ->
                    imageClickListener.onElementClick(getAdapterPosition(), itemImageView, page.getPicturePageEntity().getList().get(getAdapterPosition())));
        }
    }
}
