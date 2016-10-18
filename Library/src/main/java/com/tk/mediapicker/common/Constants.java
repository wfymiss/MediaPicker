package com.tk.mediapicker.common;


/**
 * Created by TK on 2016/9/30.
 */

public final class Constants {
    //照片裁剪
    public static final int CROP_REQUEST = 2333;
    //拍照
    public static final int CAMERA_REQUEST = 2334;
    //默认发起request
    public static final int DEFAULT_REQUEST = 2335;

    /**
     * PhotoPicker参数
     */
    public static final class PhotoPickConstants {
        public static final int DEFAULT_LIMIT = 9;
        public static final String START_CAMERA = "start_camera";
        public static final String IS_SINGLE = "is_single";
        public static final String CHECK_LIMIT = "check_limit";
        public static final String SHOW_CAMERA = "show_camera";
        public static final String NEED_CROP = "need_crop";
        //回调图片结果 flag=true data为单张，false，data为list，仅对结果处理，不与IS_SINGLE对应
        public static final String RESULT_SINGLE = "result_single";
        public static final String RESULT_DATA = "result_data";
    }

    /**
     * 相册 to 相册预览传递参数
     */
    public static final class PreAlbumConstants {
        public static final int PRE_REQUEST = 2336;
        //预览列表
        public static final String ALBUM_LIST = "album_list";
        //选中列表
        public static final String CHECK_LIST = "check_list";
        //当前index
        public static final String INDEX = "index";
        //选择限制
        public static final String LIMIT = PhotoPickConstants.CHECK_LIMIT;
        //回调是否完成选择
        public static final String FINISH = "finish";
    }


    /**
     * to 预览照片传递参数
     */
    public static final class PrePhotoConstants {
        public static final String REQUEST_DATA = "request_date";
        //选择限制
        public static final String INDEX = "index";
    }

    /**
     * VideoPicker参数
     */
    public static final class VideoPickerConstants {
        public static final int DEFAULT_LIMIT = 9;
        public static final String START_REC = "start_rec";
        public static final String IS_SINGLE = "is_single";
        public static final String CHECK_LIMIT = "check_limit";
        public static final String SHOW_REC = "show_rec";
        //回调视频结果 flag=true data为单个，false，data为list，仅对结果处理，不与IS_SINGLE对应
        public static final String RESULT_SINGLE = "result_single";
        public static final String RESULT_DATA = "result_data";
    }
}