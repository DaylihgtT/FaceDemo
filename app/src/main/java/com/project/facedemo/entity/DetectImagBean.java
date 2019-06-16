package com.project.facedemo.entity;

import java.util.List;

public class DetectImagBean {

    /**
     * image_id : FxsjGrsFoeV3Sus3ps0xzQ==
     * request_id : 1560699171,b161bdbf-cc70-4525-ba53-bf27cee642de
     * time_used : 7060
     * faces : [{"landmark":{"mouth_upper_lip_left_contour2":{"y":465,"x":1013},"mouth_upper_lip_top":{"y":458,"x":1025},"mouth_upper_lip_left_contour1":{"y":458,"x":1017},"left_eye_upper_left_quarter":{"y":359,"x":964},"left_eyebrow_lower_middle":{"y":338,"x":959},"mouth_upper_lip_left_contour3":{"y":470,"x":1021},"right_eye_top":{"y":331,"x":1046},"left_eye_bottom":{"y":370,"x":973},"right_eyebrow_lower_left_quarter":{"y":316,"x":1023},"right_eye_pupil":{"y":337,"x":1056},"mouth_lower_lip_right_contour1":{"y":464,"x":1049},"mouth_lower_lip_right_contour3":{"y":478,"x":1050},"mouth_lower_lip_right_contour2":{"y":469,"x":1062},"contour_chin":{"y":531,"x":1060},"contour_left9":{"y":519,"x":1041},"left_eye_lower_right_quarter":{"y":367,"x":981},"mouth_lower_lip_top":{"y":468,"x":1031},"right_eyebrow_upper_middle":{"y":301,"x":1037},"left_eyebrow_left_corner":{"y":340,"x":943},"right_eye_bottom":{"y":347,"x":1053},"contour_left7":{"y":483,"x":1014},"contour_left6":{"y":466,"x":1000},"contour_left5":{"y":448,"x":988},"contour_left4":{"y":428,"x":978},"contour_left3":{"y":407,"x":971},"contour_left2":{"y":386,"x":968},"contour_left1":{"y":367,"x":965},"left_eye_lower_left_quarter":{"y":369,"x":966},"contour_right1":{"y":310,"x":1156},"contour_right3":{"y":368,"x":1176},"contour_right2":{"y":339,"x":1167},"mouth_left_corner":{"y":473,"x":1014},"contour_right4":{"y":400,"x":1180},"contour_right7":{"y":483,"x":1142},"right_eyebrow_left_corner":{"y":319,"x":1006},"nose_right":{"y":418,"x":1047},"nose_tip":{"y":419,"x":993},"contour_right5":{"y":430,"x":1176},"nose_contour_lower_middle":{"y":435,"x":1014},"left_eyebrow_lower_left_quarter":{"y":339,"x":951},"mouth_lower_lip_left_contour3":{"y":484,"x":1026},"right_eye_right_corner":{"y":335,"x":1069},"right_eye_lower_right_quarter":{"y":342,"x":1063},"mouth_upper_lip_right_contour2":{"y":455,"x":1050},"right_eyebrow_lower_right_quarter":{"y":308,"x":1056},"left_eye_left_corner":{"y":366,"x":960},"mouth_right_corner":{"y":458,"x":1070},"mouth_upper_lip_right_contour3":{"y":463,"x":1048},"right_eye_lower_left_quarter":{"y":349,"x":1042},"left_eyebrow_right_corner":{"y":335,"x":976},"left_eyebrow_lower_right_quarter":{"y":337,"x":968},"right_eye_center":{"y":341,"x":1050},"nose_left":{"y":429,"x":989},"mouth_lower_lip_left_contour1":{"y":470,"x":1022},"left_eye_upper_right_quarter":{"y":357,"x":980},"right_eyebrow_lower_middle":{"y":312,"x":1039},"left_eye_top":{"y":356,"x":971},"left_eye_center":{"y":364,"x":973},"contour_left8":{"y":500,"x":1028},"contour_right9":{"y":524,"x":1090},"right_eye_left_corner":{"y":350,"x":1030},"mouth_lower_lip_bottom":{"y":484,"x":1037},"left_eyebrow_upper_left_quarter":{"y":334,"x":950},"left_eye_pupil":{"y":362,"x":977},"right_eyebrow_upper_left_quarter":{"y":307,"x":1019},"contour_right8":{"y":505,"x":1118},"right_eyebrow_right_corner":{"y":304,"x":1074},"right_eye_upper_left_quarter":{"y":339,"x":1036},"left_eyebrow_upper_middle":{"y":332,"x":959},"right_eyebrow_upper_right_quarter":{"y":299,"x":1055},"nose_contour_left1":{"y":364,"x":991},"nose_contour_left2":{"y":409,"x":988},"mouth_upper_lip_right_contour1":{"y":454,"x":1032},"nose_contour_right1":{"y":355,"x":1020},"nose_contour_right2":{"y":399,"x":1033},"mouth_lower_lip_left_contour2":{"y":479,"x":1019},"contour_right6":{"y":458,"x":1162},"nose_contour_right3":{"y":429,"x":1031},"nose_contour_left3":{"y":435,"x":1000},"left_eye_right_corner":{"y":363,"x":987},"left_eyebrow_upper_right_quarter":{"y":332,"x":968},"right_eye_upper_right_quarter":{"y":330,"x":1059},"mouth_upper_lip_bottom":{"y":468,"x":1029}},"attributes":{"beauty":{"female_score":77,"male_score":73.823},"gender":{"value":"Male"},"age":{"value":29},"eyestatus":{"left_eye_status":{"normal_glass_eye_open":0.888,"no_glass_eye_close":0,"occlusion":0.062,"no_glass_eye_open":98.997,"normal_glass_eye_close":0,"dark_glasses":0.053},"right_eye_status":{"normal_glass_eye_open":0.01,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.989,"normal_glass_eye_close":0,"dark_glasses":0}},"glass":{"value":"None"},"blur":{"blurness":{"threshold":50,"value":0.236},"motionblur":{"threshold":50,"value":0.236},"gaussianblur":{"threshold":50,"value":0.236}},"smile":{"threshold":50,"value":4.827},"facequality":{"threshold":70.1,"value":0.006}},"face_rectangle":{"width":228,"top":293,"left":962,"height":228},"face_token":"5de7a13c8922a992c70955187d3c922b"}]
     */

    private String image_id;
    private String request_id;
    private int time_used;
    private List<FacesBean> faces;

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public int getTime_used() {
        return time_used;
    }

    public void setTime_used(int time_used) {
        this.time_used = time_used;
    }

    public List<FacesBean> getFaces() {
        return faces;
    }

    public void setFaces(List<FacesBean> faces) {
        this.faces = faces;
    }

    public static class FacesBean {
        /**
         * landmark : {"mouth_upper_lip_left_contour2":{"y":465,"x":1013},"mouth_upper_lip_top":{"y":458,"x":1025},"mouth_upper_lip_left_contour1":{"y":458,"x":1017},"left_eye_upper_left_quarter":{"y":359,"x":964},"left_eyebrow_lower_middle":{"y":338,"x":959},"mouth_upper_lip_left_contour3":{"y":470,"x":1021},"right_eye_top":{"y":331,"x":1046},"left_eye_bottom":{"y":370,"x":973},"right_eyebrow_lower_left_quarter":{"y":316,"x":1023},"right_eye_pupil":{"y":337,"x":1056},"mouth_lower_lip_right_contour1":{"y":464,"x":1049},"mouth_lower_lip_right_contour3":{"y":478,"x":1050},"mouth_lower_lip_right_contour2":{"y":469,"x":1062},"contour_chin":{"y":531,"x":1060},"contour_left9":{"y":519,"x":1041},"left_eye_lower_right_quarter":{"y":367,"x":981},"mouth_lower_lip_top":{"y":468,"x":1031},"right_eyebrow_upper_middle":{"y":301,"x":1037},"left_eyebrow_left_corner":{"y":340,"x":943},"right_eye_bottom":{"y":347,"x":1053},"contour_left7":{"y":483,"x":1014},"contour_left6":{"y":466,"x":1000},"contour_left5":{"y":448,"x":988},"contour_left4":{"y":428,"x":978},"contour_left3":{"y":407,"x":971},"contour_left2":{"y":386,"x":968},"contour_left1":{"y":367,"x":965},"left_eye_lower_left_quarter":{"y":369,"x":966},"contour_right1":{"y":310,"x":1156},"contour_right3":{"y":368,"x":1176},"contour_right2":{"y":339,"x":1167},"mouth_left_corner":{"y":473,"x":1014},"contour_right4":{"y":400,"x":1180},"contour_right7":{"y":483,"x":1142},"right_eyebrow_left_corner":{"y":319,"x":1006},"nose_right":{"y":418,"x":1047},"nose_tip":{"y":419,"x":993},"contour_right5":{"y":430,"x":1176},"nose_contour_lower_middle":{"y":435,"x":1014},"left_eyebrow_lower_left_quarter":{"y":339,"x":951},"mouth_lower_lip_left_contour3":{"y":484,"x":1026},"right_eye_right_corner":{"y":335,"x":1069},"right_eye_lower_right_quarter":{"y":342,"x":1063},"mouth_upper_lip_right_contour2":{"y":455,"x":1050},"right_eyebrow_lower_right_quarter":{"y":308,"x":1056},"left_eye_left_corner":{"y":366,"x":960},"mouth_right_corner":{"y":458,"x":1070},"mouth_upper_lip_right_contour3":{"y":463,"x":1048},"right_eye_lower_left_quarter":{"y":349,"x":1042},"left_eyebrow_right_corner":{"y":335,"x":976},"left_eyebrow_lower_right_quarter":{"y":337,"x":968},"right_eye_center":{"y":341,"x":1050},"nose_left":{"y":429,"x":989},"mouth_lower_lip_left_contour1":{"y":470,"x":1022},"left_eye_upper_right_quarter":{"y":357,"x":980},"right_eyebrow_lower_middle":{"y":312,"x":1039},"left_eye_top":{"y":356,"x":971},"left_eye_center":{"y":364,"x":973},"contour_left8":{"y":500,"x":1028},"contour_right9":{"y":524,"x":1090},"right_eye_left_corner":{"y":350,"x":1030},"mouth_lower_lip_bottom":{"y":484,"x":1037},"left_eyebrow_upper_left_quarter":{"y":334,"x":950},"left_eye_pupil":{"y":362,"x":977},"right_eyebrow_upper_left_quarter":{"y":307,"x":1019},"contour_right8":{"y":505,"x":1118},"right_eyebrow_right_corner":{"y":304,"x":1074},"right_eye_upper_left_quarter":{"y":339,"x":1036},"left_eyebrow_upper_middle":{"y":332,"x":959},"right_eyebrow_upper_right_quarter":{"y":299,"x":1055},"nose_contour_left1":{"y":364,"x":991},"nose_contour_left2":{"y":409,"x":988},"mouth_upper_lip_right_contour1":{"y":454,"x":1032},"nose_contour_right1":{"y":355,"x":1020},"nose_contour_right2":{"y":399,"x":1033},"mouth_lower_lip_left_contour2":{"y":479,"x":1019},"contour_right6":{"y":458,"x":1162},"nose_contour_right3":{"y":429,"x":1031},"nose_contour_left3":{"y":435,"x":1000},"left_eye_right_corner":{"y":363,"x":987},"left_eyebrow_upper_right_quarter":{"y":332,"x":968},"right_eye_upper_right_quarter":{"y":330,"x":1059},"mouth_upper_lip_bottom":{"y":468,"x":1029}}
         * attributes : {"beauty":{"female_score":77,"male_score":73.823},"gender":{"value":"Male"},"age":{"value":29},"eyestatus":{"left_eye_status":{"normal_glass_eye_open":0.888,"no_glass_eye_close":0,"occlusion":0.062,"no_glass_eye_open":98.997,"normal_glass_eye_close":0,"dark_glasses":0.053},"right_eye_status":{"normal_glass_eye_open":0.01,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.989,"normal_glass_eye_close":0,"dark_glasses":0}},"glass":{"value":"None"},"blur":{"blurness":{"threshold":50,"value":0.236},"motionblur":{"threshold":50,"value":0.236},"gaussianblur":{"threshold":50,"value":0.236}},"smile":{"threshold":50,"value":4.827},"facequality":{"threshold":70.1,"value":0.006}}
         * face_rectangle : {"width":228,"top":293,"left":962,"height":228}
         * face_token : 5de7a13c8922a992c70955187d3c922b
         */

        private LandmarkBean landmark;
        private AttributesBean attributes;
        private FaceRectangleBean face_rectangle;
        private String face_token;

        public LandmarkBean getLandmark() {
            return landmark;
        }

        public void setLandmark(LandmarkBean landmark) {
            this.landmark = landmark;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

        public FaceRectangleBean getFace_rectangle() {
            return face_rectangle;
        }

        public void setFace_rectangle(FaceRectangleBean face_rectangle) {
            this.face_rectangle = face_rectangle;
        }

        public String getFace_token() {
            return face_token;
        }

        public void setFace_token(String face_token) {
            this.face_token = face_token;
        }

        public static class LandmarkBean {
            /**
             * mouth_upper_lip_left_contour2 : {"y":465,"x":1013}
             * mouth_upper_lip_top : {"y":458,"x":1025}
             * mouth_upper_lip_left_contour1 : {"y":458,"x":1017}
             * left_eye_upper_left_quarter : {"y":359,"x":964}
             * left_eyebrow_lower_middle : {"y":338,"x":959}
             * mouth_upper_lip_left_contour3 : {"y":470,"x":1021}
             * right_eye_top : {"y":331,"x":1046}
             * left_eye_bottom : {"y":370,"x":973}
             * right_eyebrow_lower_left_quarter : {"y":316,"x":1023}
             * right_eye_pupil : {"y":337,"x":1056}
             * mouth_lower_lip_right_contour1 : {"y":464,"x":1049}
             * mouth_lower_lip_right_contour3 : {"y":478,"x":1050}
             * mouth_lower_lip_right_contour2 : {"y":469,"x":1062}
             * contour_chin : {"y":531,"x":1060}
             * contour_left9 : {"y":519,"x":1041}
             * left_eye_lower_right_quarter : {"y":367,"x":981}
             * mouth_lower_lip_top : {"y":468,"x":1031}
             * right_eyebrow_upper_middle : {"y":301,"x":1037}
             * left_eyebrow_left_corner : {"y":340,"x":943}
             * right_eye_bottom : {"y":347,"x":1053}
             * contour_left7 : {"y":483,"x":1014}
             * contour_left6 : {"y":466,"x":1000}
             * contour_left5 : {"y":448,"x":988}
             * contour_left4 : {"y":428,"x":978}
             * contour_left3 : {"y":407,"x":971}
             * contour_left2 : {"y":386,"x":968}
             * contour_left1 : {"y":367,"x":965}
             * left_eye_lower_left_quarter : {"y":369,"x":966}
             * contour_right1 : {"y":310,"x":1156}
             * contour_right3 : {"y":368,"x":1176}
             * contour_right2 : {"y":339,"x":1167}
             * mouth_left_corner : {"y":473,"x":1014}
             * contour_right4 : {"y":400,"x":1180}
             * contour_right7 : {"y":483,"x":1142}
             * right_eyebrow_left_corner : {"y":319,"x":1006}
             * nose_right : {"y":418,"x":1047}
             * nose_tip : {"y":419,"x":993}
             * contour_right5 : {"y":430,"x":1176}
             * nose_contour_lower_middle : {"y":435,"x":1014}
             * left_eyebrow_lower_left_quarter : {"y":339,"x":951}
             * mouth_lower_lip_left_contour3 : {"y":484,"x":1026}
             * right_eye_right_corner : {"y":335,"x":1069}
             * right_eye_lower_right_quarter : {"y":342,"x":1063}
             * mouth_upper_lip_right_contour2 : {"y":455,"x":1050}
             * right_eyebrow_lower_right_quarter : {"y":308,"x":1056}
             * left_eye_left_corner : {"y":366,"x":960}
             * mouth_right_corner : {"y":458,"x":1070}
             * mouth_upper_lip_right_contour3 : {"y":463,"x":1048}
             * right_eye_lower_left_quarter : {"y":349,"x":1042}
             * left_eyebrow_right_corner : {"y":335,"x":976}
             * left_eyebrow_lower_right_quarter : {"y":337,"x":968}
             * right_eye_center : {"y":341,"x":1050}
             * nose_left : {"y":429,"x":989}
             * mouth_lower_lip_left_contour1 : {"y":470,"x":1022}
             * left_eye_upper_right_quarter : {"y":357,"x":980}
             * right_eyebrow_lower_middle : {"y":312,"x":1039}
             * left_eye_top : {"y":356,"x":971}
             * left_eye_center : {"y":364,"x":973}
             * contour_left8 : {"y":500,"x":1028}
             * contour_right9 : {"y":524,"x":1090}
             * right_eye_left_corner : {"y":350,"x":1030}
             * mouth_lower_lip_bottom : {"y":484,"x":1037}
             * left_eyebrow_upper_left_quarter : {"y":334,"x":950}
             * left_eye_pupil : {"y":362,"x":977}
             * right_eyebrow_upper_left_quarter : {"y":307,"x":1019}
             * contour_right8 : {"y":505,"x":1118}
             * right_eyebrow_right_corner : {"y":304,"x":1074}
             * right_eye_upper_left_quarter : {"y":339,"x":1036}
             * left_eyebrow_upper_middle : {"y":332,"x":959}
             * right_eyebrow_upper_right_quarter : {"y":299,"x":1055}
             * nose_contour_left1 : {"y":364,"x":991}
             * nose_contour_left2 : {"y":409,"x":988}
             * mouth_upper_lip_right_contour1 : {"y":454,"x":1032}
             * nose_contour_right1 : {"y":355,"x":1020}
             * nose_contour_right2 : {"y":399,"x":1033}
             * mouth_lower_lip_left_contour2 : {"y":479,"x":1019}
             * contour_right6 : {"y":458,"x":1162}
             * nose_contour_right3 : {"y":429,"x":1031}
             * nose_contour_left3 : {"y":435,"x":1000}
             * left_eye_right_corner : {"y":363,"x":987}
             * left_eyebrow_upper_right_quarter : {"y":332,"x":968}
             * right_eye_upper_right_quarter : {"y":330,"x":1059}
             * mouth_upper_lip_bottom : {"y":468,"x":1029}
             */

            private MouthUpperLipLeftContour2Bean mouth_upper_lip_left_contour2;
            private MouthUpperLipTopBean mouth_upper_lip_top;
            private MouthUpperLipLeftContour1Bean mouth_upper_lip_left_contour1;
            private LeftEyeUpperLeftQuarterBean left_eye_upper_left_quarter;
            private LeftEyebrowLowerMiddleBean left_eyebrow_lower_middle;
            private MouthUpperLipLeftContour3Bean mouth_upper_lip_left_contour3;
            private RightEyeTopBean right_eye_top;
            private LeftEyeBottomBean left_eye_bottom;
            private RightEyebrowLowerLeftQuarterBean right_eyebrow_lower_left_quarter;
            private RightEyePupilBean right_eye_pupil;
            private MouthLowerLipRightContour1Bean mouth_lower_lip_right_contour1;
            private MouthLowerLipRightContour3Bean mouth_lower_lip_right_contour3;
            private MouthLowerLipRightContour2Bean mouth_lower_lip_right_contour2;
            private ContourChinBean contour_chin;
            private ContourLeft9Bean contour_left9;
            private LeftEyeLowerRightQuarterBean left_eye_lower_right_quarter;
            private MouthLowerLipTopBean mouth_lower_lip_top;
            private RightEyebrowUpperMiddleBean right_eyebrow_upper_middle;
            private LeftEyebrowLeftCornerBean left_eyebrow_left_corner;
            private RightEyeBottomBean right_eye_bottom;
            private ContourLeft7Bean contour_left7;
            private ContourLeft6Bean contour_left6;
            private ContourLeft5Bean contour_left5;
            private ContourLeft4Bean contour_left4;
            private ContourLeft3Bean contour_left3;
            private ContourLeft2Bean contour_left2;
            private ContourLeft1Bean contour_left1;
            private LeftEyeLowerLeftQuarterBean left_eye_lower_left_quarter;
            private ContourRight1Bean contour_right1;
            private ContourRight3Bean contour_right3;
            private ContourRight2Bean contour_right2;
            private MouthLeftCornerBean mouth_left_corner;
            private ContourRight4Bean contour_right4;
            private ContourRight7Bean contour_right7;
            private RightEyebrowLeftCornerBean right_eyebrow_left_corner;
            private NoseRightBean nose_right;
            private NoseTipBean nose_tip;
            private ContourRight5Bean contour_right5;
            private NoseContourLowerMiddleBean nose_contour_lower_middle;
            private LeftEyebrowLowerLeftQuarterBean left_eyebrow_lower_left_quarter;
            private MouthLowerLipLeftContour3Bean mouth_lower_lip_left_contour3;
            private RightEyeRightCornerBean right_eye_right_corner;
            private RightEyeLowerRightQuarterBean right_eye_lower_right_quarter;
            private MouthUpperLipRightContour2Bean mouth_upper_lip_right_contour2;
            private RightEyebrowLowerRightQuarterBean right_eyebrow_lower_right_quarter;
            private LeftEyeLeftCornerBean left_eye_left_corner;
            private MouthRightCornerBean mouth_right_corner;
            private MouthUpperLipRightContour3Bean mouth_upper_lip_right_contour3;
            private RightEyeLowerLeftQuarterBean right_eye_lower_left_quarter;
            private LeftEyebrowRightCornerBean left_eyebrow_right_corner;
            private LeftEyebrowLowerRightQuarterBean left_eyebrow_lower_right_quarter;
            private RightEyeCenterBean right_eye_center;
            private NoseLeftBean nose_left;
            private MouthLowerLipLeftContour1Bean mouth_lower_lip_left_contour1;
            private LeftEyeUpperRightQuarterBean left_eye_upper_right_quarter;
            private RightEyebrowLowerMiddleBean right_eyebrow_lower_middle;
            private LeftEyeTopBean left_eye_top;
            private LeftEyeCenterBean left_eye_center;
            private ContourLeft8Bean contour_left8;
            private ContourRight9Bean contour_right9;
            private RightEyeLeftCornerBean right_eye_left_corner;
            private MouthLowerLipBottomBean mouth_lower_lip_bottom;
            private LeftEyebrowUpperLeftQuarterBean left_eyebrow_upper_left_quarter;
            private LeftEyePupilBean left_eye_pupil;
            private RightEyebrowUpperLeftQuarterBean right_eyebrow_upper_left_quarter;
            private ContourRight8Bean contour_right8;
            private RightEyebrowRightCornerBean right_eyebrow_right_corner;
            private RightEyeUpperLeftQuarterBean right_eye_upper_left_quarter;
            private LeftEyebrowUpperMiddleBean left_eyebrow_upper_middle;
            private RightEyebrowUpperRightQuarterBean right_eyebrow_upper_right_quarter;
            private NoseContourLeft1Bean nose_contour_left1;
            private NoseContourLeft2Bean nose_contour_left2;
            private MouthUpperLipRightContour1Bean mouth_upper_lip_right_contour1;
            private NoseContourRight1Bean nose_contour_right1;
            private NoseContourRight2Bean nose_contour_right2;
            private MouthLowerLipLeftContour2Bean mouth_lower_lip_left_contour2;
            private ContourRight6Bean contour_right6;
            private NoseContourRight3Bean nose_contour_right3;
            private NoseContourLeft3Bean nose_contour_left3;
            private LeftEyeRightCornerBean left_eye_right_corner;
            private LeftEyebrowUpperRightQuarterBean left_eyebrow_upper_right_quarter;
            private RightEyeUpperRightQuarterBean right_eye_upper_right_quarter;
            private MouthUpperLipBottomBean mouth_upper_lip_bottom;

            public MouthUpperLipLeftContour2Bean getMouth_upper_lip_left_contour2() {
                return mouth_upper_lip_left_contour2;
            }

            public void setMouth_upper_lip_left_contour2(MouthUpperLipLeftContour2Bean mouth_upper_lip_left_contour2) {
                this.mouth_upper_lip_left_contour2 = mouth_upper_lip_left_contour2;
            }

            public MouthUpperLipTopBean getMouth_upper_lip_top() {
                return mouth_upper_lip_top;
            }

            public void setMouth_upper_lip_top(MouthUpperLipTopBean mouth_upper_lip_top) {
                this.mouth_upper_lip_top = mouth_upper_lip_top;
            }

            public MouthUpperLipLeftContour1Bean getMouth_upper_lip_left_contour1() {
                return mouth_upper_lip_left_contour1;
            }

            public void setMouth_upper_lip_left_contour1(MouthUpperLipLeftContour1Bean mouth_upper_lip_left_contour1) {
                this.mouth_upper_lip_left_contour1 = mouth_upper_lip_left_contour1;
            }

            public LeftEyeUpperLeftQuarterBean getLeft_eye_upper_left_quarter() {
                return left_eye_upper_left_quarter;
            }

            public void setLeft_eye_upper_left_quarter(LeftEyeUpperLeftQuarterBean left_eye_upper_left_quarter) {
                this.left_eye_upper_left_quarter = left_eye_upper_left_quarter;
            }

            public LeftEyebrowLowerMiddleBean getLeft_eyebrow_lower_middle() {
                return left_eyebrow_lower_middle;
            }

            public void setLeft_eyebrow_lower_middle(LeftEyebrowLowerMiddleBean left_eyebrow_lower_middle) {
                this.left_eyebrow_lower_middle = left_eyebrow_lower_middle;
            }

            public MouthUpperLipLeftContour3Bean getMouth_upper_lip_left_contour3() {
                return mouth_upper_lip_left_contour3;
            }

            public void setMouth_upper_lip_left_contour3(MouthUpperLipLeftContour3Bean mouth_upper_lip_left_contour3) {
                this.mouth_upper_lip_left_contour3 = mouth_upper_lip_left_contour3;
            }

            public RightEyeTopBean getRight_eye_top() {
                return right_eye_top;
            }

            public void setRight_eye_top(RightEyeTopBean right_eye_top) {
                this.right_eye_top = right_eye_top;
            }

            public LeftEyeBottomBean getLeft_eye_bottom() {
                return left_eye_bottom;
            }

            public void setLeft_eye_bottom(LeftEyeBottomBean left_eye_bottom) {
                this.left_eye_bottom = left_eye_bottom;
            }

            public RightEyebrowLowerLeftQuarterBean getRight_eyebrow_lower_left_quarter() {
                return right_eyebrow_lower_left_quarter;
            }

            public void setRight_eyebrow_lower_left_quarter(RightEyebrowLowerLeftQuarterBean right_eyebrow_lower_left_quarter) {
                this.right_eyebrow_lower_left_quarter = right_eyebrow_lower_left_quarter;
            }

            public RightEyePupilBean getRight_eye_pupil() {
                return right_eye_pupil;
            }

            public void setRight_eye_pupil(RightEyePupilBean right_eye_pupil) {
                this.right_eye_pupil = right_eye_pupil;
            }

            public MouthLowerLipRightContour1Bean getMouth_lower_lip_right_contour1() {
                return mouth_lower_lip_right_contour1;
            }

            public void setMouth_lower_lip_right_contour1(MouthLowerLipRightContour1Bean mouth_lower_lip_right_contour1) {
                this.mouth_lower_lip_right_contour1 = mouth_lower_lip_right_contour1;
            }

            public MouthLowerLipRightContour3Bean getMouth_lower_lip_right_contour3() {
                return mouth_lower_lip_right_contour3;
            }

            public void setMouth_lower_lip_right_contour3(MouthLowerLipRightContour3Bean mouth_lower_lip_right_contour3) {
                this.mouth_lower_lip_right_contour3 = mouth_lower_lip_right_contour3;
            }

            public MouthLowerLipRightContour2Bean getMouth_lower_lip_right_contour2() {
                return mouth_lower_lip_right_contour2;
            }

            public void setMouth_lower_lip_right_contour2(MouthLowerLipRightContour2Bean mouth_lower_lip_right_contour2) {
                this.mouth_lower_lip_right_contour2 = mouth_lower_lip_right_contour2;
            }

            public ContourChinBean getContour_chin() {
                return contour_chin;
            }

            public void setContour_chin(ContourChinBean contour_chin) {
                this.contour_chin = contour_chin;
            }

            public ContourLeft9Bean getContour_left9() {
                return contour_left9;
            }

            public void setContour_left9(ContourLeft9Bean contour_left9) {
                this.contour_left9 = contour_left9;
            }

            public LeftEyeLowerRightQuarterBean getLeft_eye_lower_right_quarter() {
                return left_eye_lower_right_quarter;
            }

            public void setLeft_eye_lower_right_quarter(LeftEyeLowerRightQuarterBean left_eye_lower_right_quarter) {
                this.left_eye_lower_right_quarter = left_eye_lower_right_quarter;
            }

            public MouthLowerLipTopBean getMouth_lower_lip_top() {
                return mouth_lower_lip_top;
            }

            public void setMouth_lower_lip_top(MouthLowerLipTopBean mouth_lower_lip_top) {
                this.mouth_lower_lip_top = mouth_lower_lip_top;
            }

            public RightEyebrowUpperMiddleBean getRight_eyebrow_upper_middle() {
                return right_eyebrow_upper_middle;
            }

            public void setRight_eyebrow_upper_middle(RightEyebrowUpperMiddleBean right_eyebrow_upper_middle) {
                this.right_eyebrow_upper_middle = right_eyebrow_upper_middle;
            }

            public LeftEyebrowLeftCornerBean getLeft_eyebrow_left_corner() {
                return left_eyebrow_left_corner;
            }

            public void setLeft_eyebrow_left_corner(LeftEyebrowLeftCornerBean left_eyebrow_left_corner) {
                this.left_eyebrow_left_corner = left_eyebrow_left_corner;
            }

            public RightEyeBottomBean getRight_eye_bottom() {
                return right_eye_bottom;
            }

            public void setRight_eye_bottom(RightEyeBottomBean right_eye_bottom) {
                this.right_eye_bottom = right_eye_bottom;
            }

            public ContourLeft7Bean getContour_left7() {
                return contour_left7;
            }

            public void setContour_left7(ContourLeft7Bean contour_left7) {
                this.contour_left7 = contour_left7;
            }

            public ContourLeft6Bean getContour_left6() {
                return contour_left6;
            }

            public void setContour_left6(ContourLeft6Bean contour_left6) {
                this.contour_left6 = contour_left6;
            }

            public ContourLeft5Bean getContour_left5() {
                return contour_left5;
            }

            public void setContour_left5(ContourLeft5Bean contour_left5) {
                this.contour_left5 = contour_left5;
            }

            public ContourLeft4Bean getContour_left4() {
                return contour_left4;
            }

            public void setContour_left4(ContourLeft4Bean contour_left4) {
                this.contour_left4 = contour_left4;
            }

            public ContourLeft3Bean getContour_left3() {
                return contour_left3;
            }

            public void setContour_left3(ContourLeft3Bean contour_left3) {
                this.contour_left3 = contour_left3;
            }

            public ContourLeft2Bean getContour_left2() {
                return contour_left2;
            }

            public void setContour_left2(ContourLeft2Bean contour_left2) {
                this.contour_left2 = contour_left2;
            }

            public ContourLeft1Bean getContour_left1() {
                return contour_left1;
            }

            public void setContour_left1(ContourLeft1Bean contour_left1) {
                this.contour_left1 = contour_left1;
            }

            public LeftEyeLowerLeftQuarterBean getLeft_eye_lower_left_quarter() {
                return left_eye_lower_left_quarter;
            }

            public void setLeft_eye_lower_left_quarter(LeftEyeLowerLeftQuarterBean left_eye_lower_left_quarter) {
                this.left_eye_lower_left_quarter = left_eye_lower_left_quarter;
            }

            public ContourRight1Bean getContour_right1() {
                return contour_right1;
            }

            public void setContour_right1(ContourRight1Bean contour_right1) {
                this.contour_right1 = contour_right1;
            }

            public ContourRight3Bean getContour_right3() {
                return contour_right3;
            }

            public void setContour_right3(ContourRight3Bean contour_right3) {
                this.contour_right3 = contour_right3;
            }

            public ContourRight2Bean getContour_right2() {
                return contour_right2;
            }

            public void setContour_right2(ContourRight2Bean contour_right2) {
                this.contour_right2 = contour_right2;
            }

            public MouthLeftCornerBean getMouth_left_corner() {
                return mouth_left_corner;
            }

            public void setMouth_left_corner(MouthLeftCornerBean mouth_left_corner) {
                this.mouth_left_corner = mouth_left_corner;
            }

            public ContourRight4Bean getContour_right4() {
                return contour_right4;
            }

            public void setContour_right4(ContourRight4Bean contour_right4) {
                this.contour_right4 = contour_right4;
            }

            public ContourRight7Bean getContour_right7() {
                return contour_right7;
            }

            public void setContour_right7(ContourRight7Bean contour_right7) {
                this.contour_right7 = contour_right7;
            }

            public RightEyebrowLeftCornerBean getRight_eyebrow_left_corner() {
                return right_eyebrow_left_corner;
            }

            public void setRight_eyebrow_left_corner(RightEyebrowLeftCornerBean right_eyebrow_left_corner) {
                this.right_eyebrow_left_corner = right_eyebrow_left_corner;
            }

            public NoseRightBean getNose_right() {
                return nose_right;
            }

            public void setNose_right(NoseRightBean nose_right) {
                this.nose_right = nose_right;
            }

            public NoseTipBean getNose_tip() {
                return nose_tip;
            }

            public void setNose_tip(NoseTipBean nose_tip) {
                this.nose_tip = nose_tip;
            }

            public ContourRight5Bean getContour_right5() {
                return contour_right5;
            }

            public void setContour_right5(ContourRight5Bean contour_right5) {
                this.contour_right5 = contour_right5;
            }

            public NoseContourLowerMiddleBean getNose_contour_lower_middle() {
                return nose_contour_lower_middle;
            }

            public void setNose_contour_lower_middle(NoseContourLowerMiddleBean nose_contour_lower_middle) {
                this.nose_contour_lower_middle = nose_contour_lower_middle;
            }

            public LeftEyebrowLowerLeftQuarterBean getLeft_eyebrow_lower_left_quarter() {
                return left_eyebrow_lower_left_quarter;
            }

            public void setLeft_eyebrow_lower_left_quarter(LeftEyebrowLowerLeftQuarterBean left_eyebrow_lower_left_quarter) {
                this.left_eyebrow_lower_left_quarter = left_eyebrow_lower_left_quarter;
            }

            public MouthLowerLipLeftContour3Bean getMouth_lower_lip_left_contour3() {
                return mouth_lower_lip_left_contour3;
            }

            public void setMouth_lower_lip_left_contour3(MouthLowerLipLeftContour3Bean mouth_lower_lip_left_contour3) {
                this.mouth_lower_lip_left_contour3 = mouth_lower_lip_left_contour3;
            }

            public RightEyeRightCornerBean getRight_eye_right_corner() {
                return right_eye_right_corner;
            }

            public void setRight_eye_right_corner(RightEyeRightCornerBean right_eye_right_corner) {
                this.right_eye_right_corner = right_eye_right_corner;
            }

            public RightEyeLowerRightQuarterBean getRight_eye_lower_right_quarter() {
                return right_eye_lower_right_quarter;
            }

            public void setRight_eye_lower_right_quarter(RightEyeLowerRightQuarterBean right_eye_lower_right_quarter) {
                this.right_eye_lower_right_quarter = right_eye_lower_right_quarter;
            }

            public MouthUpperLipRightContour2Bean getMouth_upper_lip_right_contour2() {
                return mouth_upper_lip_right_contour2;
            }

            public void setMouth_upper_lip_right_contour2(MouthUpperLipRightContour2Bean mouth_upper_lip_right_contour2) {
                this.mouth_upper_lip_right_contour2 = mouth_upper_lip_right_contour2;
            }

            public RightEyebrowLowerRightQuarterBean getRight_eyebrow_lower_right_quarter() {
                return right_eyebrow_lower_right_quarter;
            }

            public void setRight_eyebrow_lower_right_quarter(RightEyebrowLowerRightQuarterBean right_eyebrow_lower_right_quarter) {
                this.right_eyebrow_lower_right_quarter = right_eyebrow_lower_right_quarter;
            }

            public LeftEyeLeftCornerBean getLeft_eye_left_corner() {
                return left_eye_left_corner;
            }

            public void setLeft_eye_left_corner(LeftEyeLeftCornerBean left_eye_left_corner) {
                this.left_eye_left_corner = left_eye_left_corner;
            }

            public MouthRightCornerBean getMouth_right_corner() {
                return mouth_right_corner;
            }

            public void setMouth_right_corner(MouthRightCornerBean mouth_right_corner) {
                this.mouth_right_corner = mouth_right_corner;
            }

            public MouthUpperLipRightContour3Bean getMouth_upper_lip_right_contour3() {
                return mouth_upper_lip_right_contour3;
            }

            public void setMouth_upper_lip_right_contour3(MouthUpperLipRightContour3Bean mouth_upper_lip_right_contour3) {
                this.mouth_upper_lip_right_contour3 = mouth_upper_lip_right_contour3;
            }

            public RightEyeLowerLeftQuarterBean getRight_eye_lower_left_quarter() {
                return right_eye_lower_left_quarter;
            }

            public void setRight_eye_lower_left_quarter(RightEyeLowerLeftQuarterBean right_eye_lower_left_quarter) {
                this.right_eye_lower_left_quarter = right_eye_lower_left_quarter;
            }

            public LeftEyebrowRightCornerBean getLeft_eyebrow_right_corner() {
                return left_eyebrow_right_corner;
            }

            public void setLeft_eyebrow_right_corner(LeftEyebrowRightCornerBean left_eyebrow_right_corner) {
                this.left_eyebrow_right_corner = left_eyebrow_right_corner;
            }

            public LeftEyebrowLowerRightQuarterBean getLeft_eyebrow_lower_right_quarter() {
                return left_eyebrow_lower_right_quarter;
            }

            public void setLeft_eyebrow_lower_right_quarter(LeftEyebrowLowerRightQuarterBean left_eyebrow_lower_right_quarter) {
                this.left_eyebrow_lower_right_quarter = left_eyebrow_lower_right_quarter;
            }

            public RightEyeCenterBean getRight_eye_center() {
                return right_eye_center;
            }

            public void setRight_eye_center(RightEyeCenterBean right_eye_center) {
                this.right_eye_center = right_eye_center;
            }

            public NoseLeftBean getNose_left() {
                return nose_left;
            }

            public void setNose_left(NoseLeftBean nose_left) {
                this.nose_left = nose_left;
            }

            public MouthLowerLipLeftContour1Bean getMouth_lower_lip_left_contour1() {
                return mouth_lower_lip_left_contour1;
            }

            public void setMouth_lower_lip_left_contour1(MouthLowerLipLeftContour1Bean mouth_lower_lip_left_contour1) {
                this.mouth_lower_lip_left_contour1 = mouth_lower_lip_left_contour1;
            }

            public LeftEyeUpperRightQuarterBean getLeft_eye_upper_right_quarter() {
                return left_eye_upper_right_quarter;
            }

            public void setLeft_eye_upper_right_quarter(LeftEyeUpperRightQuarterBean left_eye_upper_right_quarter) {
                this.left_eye_upper_right_quarter = left_eye_upper_right_quarter;
            }

            public RightEyebrowLowerMiddleBean getRight_eyebrow_lower_middle() {
                return right_eyebrow_lower_middle;
            }

            public void setRight_eyebrow_lower_middle(RightEyebrowLowerMiddleBean right_eyebrow_lower_middle) {
                this.right_eyebrow_lower_middle = right_eyebrow_lower_middle;
            }

            public LeftEyeTopBean getLeft_eye_top() {
                return left_eye_top;
            }

            public void setLeft_eye_top(LeftEyeTopBean left_eye_top) {
                this.left_eye_top = left_eye_top;
            }

            public LeftEyeCenterBean getLeft_eye_center() {
                return left_eye_center;
            }

            public void setLeft_eye_center(LeftEyeCenterBean left_eye_center) {
                this.left_eye_center = left_eye_center;
            }

            public ContourLeft8Bean getContour_left8() {
                return contour_left8;
            }

            public void setContour_left8(ContourLeft8Bean contour_left8) {
                this.contour_left8 = contour_left8;
            }

            public ContourRight9Bean getContour_right9() {
                return contour_right9;
            }

            public void setContour_right9(ContourRight9Bean contour_right9) {
                this.contour_right9 = contour_right9;
            }

            public RightEyeLeftCornerBean getRight_eye_left_corner() {
                return right_eye_left_corner;
            }

            public void setRight_eye_left_corner(RightEyeLeftCornerBean right_eye_left_corner) {
                this.right_eye_left_corner = right_eye_left_corner;
            }

            public MouthLowerLipBottomBean getMouth_lower_lip_bottom() {
                return mouth_lower_lip_bottom;
            }

            public void setMouth_lower_lip_bottom(MouthLowerLipBottomBean mouth_lower_lip_bottom) {
                this.mouth_lower_lip_bottom = mouth_lower_lip_bottom;
            }

            public LeftEyebrowUpperLeftQuarterBean getLeft_eyebrow_upper_left_quarter() {
                return left_eyebrow_upper_left_quarter;
            }

            public void setLeft_eyebrow_upper_left_quarter(LeftEyebrowUpperLeftQuarterBean left_eyebrow_upper_left_quarter) {
                this.left_eyebrow_upper_left_quarter = left_eyebrow_upper_left_quarter;
            }

            public LeftEyePupilBean getLeft_eye_pupil() {
                return left_eye_pupil;
            }

            public void setLeft_eye_pupil(LeftEyePupilBean left_eye_pupil) {
                this.left_eye_pupil = left_eye_pupil;
            }

            public RightEyebrowUpperLeftQuarterBean getRight_eyebrow_upper_left_quarter() {
                return right_eyebrow_upper_left_quarter;
            }

            public void setRight_eyebrow_upper_left_quarter(RightEyebrowUpperLeftQuarterBean right_eyebrow_upper_left_quarter) {
                this.right_eyebrow_upper_left_quarter = right_eyebrow_upper_left_quarter;
            }

            public ContourRight8Bean getContour_right8() {
                return contour_right8;
            }

            public void setContour_right8(ContourRight8Bean contour_right8) {
                this.contour_right8 = contour_right8;
            }

            public RightEyebrowRightCornerBean getRight_eyebrow_right_corner() {
                return right_eyebrow_right_corner;
            }

            public void setRight_eyebrow_right_corner(RightEyebrowRightCornerBean right_eyebrow_right_corner) {
                this.right_eyebrow_right_corner = right_eyebrow_right_corner;
            }

            public RightEyeUpperLeftQuarterBean getRight_eye_upper_left_quarter() {
                return right_eye_upper_left_quarter;
            }

            public void setRight_eye_upper_left_quarter(RightEyeUpperLeftQuarterBean right_eye_upper_left_quarter) {
                this.right_eye_upper_left_quarter = right_eye_upper_left_quarter;
            }

            public LeftEyebrowUpperMiddleBean getLeft_eyebrow_upper_middle() {
                return left_eyebrow_upper_middle;
            }

            public void setLeft_eyebrow_upper_middle(LeftEyebrowUpperMiddleBean left_eyebrow_upper_middle) {
                this.left_eyebrow_upper_middle = left_eyebrow_upper_middle;
            }

            public RightEyebrowUpperRightQuarterBean getRight_eyebrow_upper_right_quarter() {
                return right_eyebrow_upper_right_quarter;
            }

            public void setRight_eyebrow_upper_right_quarter(RightEyebrowUpperRightQuarterBean right_eyebrow_upper_right_quarter) {
                this.right_eyebrow_upper_right_quarter = right_eyebrow_upper_right_quarter;
            }

            public NoseContourLeft1Bean getNose_contour_left1() {
                return nose_contour_left1;
            }

            public void setNose_contour_left1(NoseContourLeft1Bean nose_contour_left1) {
                this.nose_contour_left1 = nose_contour_left1;
            }

            public NoseContourLeft2Bean getNose_contour_left2() {
                return nose_contour_left2;
            }

            public void setNose_contour_left2(NoseContourLeft2Bean nose_contour_left2) {
                this.nose_contour_left2 = nose_contour_left2;
            }

            public MouthUpperLipRightContour1Bean getMouth_upper_lip_right_contour1() {
                return mouth_upper_lip_right_contour1;
            }

            public void setMouth_upper_lip_right_contour1(MouthUpperLipRightContour1Bean mouth_upper_lip_right_contour1) {
                this.mouth_upper_lip_right_contour1 = mouth_upper_lip_right_contour1;
            }

            public NoseContourRight1Bean getNose_contour_right1() {
                return nose_contour_right1;
            }

            public void setNose_contour_right1(NoseContourRight1Bean nose_contour_right1) {
                this.nose_contour_right1 = nose_contour_right1;
            }

            public NoseContourRight2Bean getNose_contour_right2() {
                return nose_contour_right2;
            }

            public void setNose_contour_right2(NoseContourRight2Bean nose_contour_right2) {
                this.nose_contour_right2 = nose_contour_right2;
            }

            public MouthLowerLipLeftContour2Bean getMouth_lower_lip_left_contour2() {
                return mouth_lower_lip_left_contour2;
            }

            public void setMouth_lower_lip_left_contour2(MouthLowerLipLeftContour2Bean mouth_lower_lip_left_contour2) {
                this.mouth_lower_lip_left_contour2 = mouth_lower_lip_left_contour2;
            }

            public ContourRight6Bean getContour_right6() {
                return contour_right6;
            }

            public void setContour_right6(ContourRight6Bean contour_right6) {
                this.contour_right6 = contour_right6;
            }

            public NoseContourRight3Bean getNose_contour_right3() {
                return nose_contour_right3;
            }

            public void setNose_contour_right3(NoseContourRight3Bean nose_contour_right3) {
                this.nose_contour_right3 = nose_contour_right3;
            }

            public NoseContourLeft3Bean getNose_contour_left3() {
                return nose_contour_left3;
            }

            public void setNose_contour_left3(NoseContourLeft3Bean nose_contour_left3) {
                this.nose_contour_left3 = nose_contour_left3;
            }

            public LeftEyeRightCornerBean getLeft_eye_right_corner() {
                return left_eye_right_corner;
            }

            public void setLeft_eye_right_corner(LeftEyeRightCornerBean left_eye_right_corner) {
                this.left_eye_right_corner = left_eye_right_corner;
            }

            public LeftEyebrowUpperRightQuarterBean getLeft_eyebrow_upper_right_quarter() {
                return left_eyebrow_upper_right_quarter;
            }

            public void setLeft_eyebrow_upper_right_quarter(LeftEyebrowUpperRightQuarterBean left_eyebrow_upper_right_quarter) {
                this.left_eyebrow_upper_right_quarter = left_eyebrow_upper_right_quarter;
            }

            public RightEyeUpperRightQuarterBean getRight_eye_upper_right_quarter() {
                return right_eye_upper_right_quarter;
            }

            public void setRight_eye_upper_right_quarter(RightEyeUpperRightQuarterBean right_eye_upper_right_quarter) {
                this.right_eye_upper_right_quarter = right_eye_upper_right_quarter;
            }

            public MouthUpperLipBottomBean getMouth_upper_lip_bottom() {
                return mouth_upper_lip_bottom;
            }

            public void setMouth_upper_lip_bottom(MouthUpperLipBottomBean mouth_upper_lip_bottom) {
                this.mouth_upper_lip_bottom = mouth_upper_lip_bottom;
            }

            public static class MouthUpperLipLeftContour2Bean {
                /**
                 * y : 465
                 * x : 1013
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipTopBean {
                /**
                 * y : 458
                 * x : 1025
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipLeftContour1Bean {
                /**
                 * y : 458
                 * x : 1017
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeUpperLeftQuarterBean {
                /**
                 * y : 359
                 * x : 964
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLowerMiddleBean {
                /**
                 * y : 338
                 * x : 959
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipLeftContour3Bean {
                /**
                 * y : 470
                 * x : 1021
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeTopBean {
                /**
                 * y : 331
                 * x : 1046
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeBottomBean {
                /**
                 * y : 370
                 * x : 973
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLowerLeftQuarterBean {
                /**
                 * y : 316
                 * x : 1023
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyePupilBean {
                /**
                 * y : 337
                 * x : 1056
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipRightContour1Bean {
                /**
                 * y : 464
                 * x : 1049
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipRightContour3Bean {
                /**
                 * y : 478
                 * x : 1050
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipRightContour2Bean {
                /**
                 * y : 469
                 * x : 1062
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourChinBean {
                /**
                 * y : 531
                 * x : 1060
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft9Bean {
                /**
                 * y : 519
                 * x : 1041
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeLowerRightQuarterBean {
                /**
                 * y : 367
                 * x : 981
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipTopBean {
                /**
                 * y : 468
                 * x : 1031
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowUpperMiddleBean {
                /**
                 * y : 301
                 * x : 1037
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLeftCornerBean {
                /**
                 * y : 340
                 * x : 943
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeBottomBean {
                /**
                 * y : 347
                 * x : 1053
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft7Bean {
                /**
                 * y : 483
                 * x : 1014
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft6Bean {
                /**
                 * y : 466
                 * x : 1000
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft5Bean {
                /**
                 * y : 448
                 * x : 988
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft4Bean {
                /**
                 * y : 428
                 * x : 978
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft3Bean {
                /**
                 * y : 407
                 * x : 971
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft2Bean {
                /**
                 * y : 386
                 * x : 968
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft1Bean {
                /**
                 * y : 367
                 * x : 965
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeLowerLeftQuarterBean {
                /**
                 * y : 369
                 * x : 966
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight1Bean {
                /**
                 * y : 310
                 * x : 1156
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight3Bean {
                /**
                 * y : 368
                 * x : 1176
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight2Bean {
                /**
                 * y : 339
                 * x : 1167
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLeftCornerBean {
                /**
                 * y : 473
                 * x : 1014
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight4Bean {
                /**
                 * y : 400
                 * x : 1180
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight7Bean {
                /**
                 * y : 483
                 * x : 1142
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLeftCornerBean {
                /**
                 * y : 319
                 * x : 1006
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseRightBean {
                /**
                 * y : 418
                 * x : 1047
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseTipBean {
                /**
                 * y : 419
                 * x : 993
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight5Bean {
                /**
                 * y : 430
                 * x : 1176
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLowerMiddleBean {
                /**
                 * y : 435
                 * x : 1014
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLowerLeftQuarterBean {
                /**
                 * y : 339
                 * x : 951
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipLeftContour3Bean {
                /**
                 * y : 484
                 * x : 1026
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeRightCornerBean {
                /**
                 * y : 335
                 * x : 1069
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeLowerRightQuarterBean {
                /**
                 * y : 342
                 * x : 1063
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipRightContour2Bean {
                /**
                 * y : 455
                 * x : 1050
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLowerRightQuarterBean {
                /**
                 * y : 308
                 * x : 1056
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeLeftCornerBean {
                /**
                 * y : 366
                 * x : 960
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthRightCornerBean {
                /**
                 * y : 458
                 * x : 1070
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipRightContour3Bean {
                /**
                 * y : 463
                 * x : 1048
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeLowerLeftQuarterBean {
                /**
                 * y : 349
                 * x : 1042
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowRightCornerBean {
                /**
                 * y : 335
                 * x : 976
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowLowerRightQuarterBean {
                /**
                 * y : 337
                 * x : 968
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeCenterBean {
                /**
                 * y : 341
                 * x : 1050
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseLeftBean {
                /**
                 * y : 429
                 * x : 989
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipLeftContour1Bean {
                /**
                 * y : 470
                 * x : 1022
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeUpperRightQuarterBean {
                /**
                 * y : 357
                 * x : 980
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowLowerMiddleBean {
                /**
                 * y : 312
                 * x : 1039
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeTopBean {
                /**
                 * y : 356
                 * x : 971
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeCenterBean {
                /**
                 * y : 364
                 * x : 973
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourLeft8Bean {
                /**
                 * y : 500
                 * x : 1028
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight9Bean {
                /**
                 * y : 524
                 * x : 1090
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeLeftCornerBean {
                /**
                 * y : 350
                 * x : 1030
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipBottomBean {
                /**
                 * y : 484
                 * x : 1037
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowUpperLeftQuarterBean {
                /**
                 * y : 334
                 * x : 950
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyePupilBean {
                /**
                 * y : 362
                 * x : 977
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowUpperLeftQuarterBean {
                /**
                 * y : 307
                 * x : 1019
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight8Bean {
                /**
                 * y : 505
                 * x : 1118
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowRightCornerBean {
                /**
                 * y : 304
                 * x : 1074
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeUpperLeftQuarterBean {
                /**
                 * y : 339
                 * x : 1036
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowUpperMiddleBean {
                /**
                 * y : 332
                 * x : 959
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyebrowUpperRightQuarterBean {
                /**
                 * y : 299
                 * x : 1055
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLeft1Bean {
                /**
                 * y : 364
                 * x : 991
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLeft2Bean {
                /**
                 * y : 409
                 * x : 988
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipRightContour1Bean {
                /**
                 * y : 454
                 * x : 1032
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourRight1Bean {
                /**
                 * y : 355
                 * x : 1020
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourRight2Bean {
                /**
                 * y : 399
                 * x : 1033
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthLowerLipLeftContour2Bean {
                /**
                 * y : 479
                 * x : 1019
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ContourRight6Bean {
                /**
                 * y : 458
                 * x : 1162
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourRight3Bean {
                /**
                 * y : 429
                 * x : 1031
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class NoseContourLeft3Bean {
                /**
                 * y : 435
                 * x : 1000
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyeRightCornerBean {
                /**
                 * y : 363
                 * x : 987
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class LeftEyebrowUpperRightQuarterBean {
                /**
                 * y : 332
                 * x : 968
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class RightEyeUpperRightQuarterBean {
                /**
                 * y : 330
                 * x : 1059
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class MouthUpperLipBottomBean {
                /**
                 * y : 468
                 * x : 1029
                 */

                private int y;
                private int x;

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }
        }

        public static class AttributesBean {
            /**
             * beauty : {"female_score":77,"male_score":73.823}
             * gender : {"value":"Male"}
             * age : {"value":29}
             * eyestatus : {"left_eye_status":{"normal_glass_eye_open":0.888,"no_glass_eye_close":0,"occlusion":0.062,"no_glass_eye_open":98.997,"normal_glass_eye_close":0,"dark_glasses":0.053},"right_eye_status":{"normal_glass_eye_open":0.01,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.989,"normal_glass_eye_close":0,"dark_glasses":0}}
             * glass : {"value":"None"}
             * blur : {"blurness":{"threshold":50,"value":0.236},"motionblur":{"threshold":50,"value":0.236},"gaussianblur":{"threshold":50,"value":0.236}}
             * smile : {"threshold":50,"value":4.827}
             * facequality : {"threshold":70.1,"value":0.006}
             */

            private BeautyBean beauty;
            private GenderBean gender;
            private AgeBean age;
            private EyestatusBean eyestatus;
            private GlassBean glass;
            private BlurBean blur;
            private SmileBean smile;
            private FacequalityBean facequality;

            public BeautyBean getBeauty() {
                return beauty;
            }

            public void setBeauty(BeautyBean beauty) {
                this.beauty = beauty;
            }

            public GenderBean getGender() {
                return gender;
            }

            public void setGender(GenderBean gender) {
                this.gender = gender;
            }

            public AgeBean getAge() {
                return age;
            }

            public void setAge(AgeBean age) {
                this.age = age;
            }

            public EyestatusBean getEyestatus() {
                return eyestatus;
            }

            public void setEyestatus(EyestatusBean eyestatus) {
                this.eyestatus = eyestatus;
            }

            public GlassBean getGlass() {
                return glass;
            }

            public void setGlass(GlassBean glass) {
                this.glass = glass;
            }

            public BlurBean getBlur() {
                return blur;
            }

            public void setBlur(BlurBean blur) {
                this.blur = blur;
            }

            public SmileBean getSmile() {
                return smile;
            }

            public void setSmile(SmileBean smile) {
                this.smile = smile;
            }

            public FacequalityBean getFacequality() {
                return facequality;
            }

            public void setFacequality(FacequalityBean facequality) {
                this.facequality = facequality;
            }

            public static class BeautyBean {
                /**
                 * female_score : 77
                 * male_score : 73.823
                 */

                private int female_score;
                private double male_score;

                public int getFemale_score() {
                    return female_score;
                }

                public void setFemale_score(int female_score) {
                    this.female_score = female_score;
                }

                public double getMale_score() {
                    return male_score;
                }

                public void setMale_score(double male_score) {
                    this.male_score = male_score;
                }
            }

            public static class GenderBean {
                /**
                 * value : Male
                 */

                private String value;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class AgeBean {
                /**
                 * value : 29
                 */

                private int value;

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EyestatusBean {
                /**
                 * left_eye_status : {"normal_glass_eye_open":0.888,"no_glass_eye_close":0,"occlusion":0.062,"no_glass_eye_open":98.997,"normal_glass_eye_close":0,"dark_glasses":0.053}
                 * right_eye_status : {"normal_glass_eye_open":0.01,"no_glass_eye_close":0,"occlusion":0,"no_glass_eye_open":99.989,"normal_glass_eye_close":0,"dark_glasses":0}
                 */

                private LeftEyeStatusBean left_eye_status;
                private RightEyeStatusBean right_eye_status;

                public LeftEyeStatusBean getLeft_eye_status() {
                    return left_eye_status;
                }

                public void setLeft_eye_status(LeftEyeStatusBean left_eye_status) {
                    this.left_eye_status = left_eye_status;
                }

                public RightEyeStatusBean getRight_eye_status() {
                    return right_eye_status;
                }

                public void setRight_eye_status(RightEyeStatusBean right_eye_status) {
                    this.right_eye_status = right_eye_status;
                }

                public static class LeftEyeStatusBean {
                    /**
                     * normal_glass_eye_open : 0.888
                     * no_glass_eye_close : 0
                     * occlusion : 0.062
                     * no_glass_eye_open : 98.997
                     * normal_glass_eye_close : 0
                     * dark_glasses : 0.053
                     */

                    private double normal_glass_eye_open;
                    private int no_glass_eye_close;
                    private double occlusion;
                    private double no_glass_eye_open;
                    private int normal_glass_eye_close;
                    private double dark_glasses;

                    public double getNormal_glass_eye_open() {
                        return normal_glass_eye_open;
                    }

                    public void setNormal_glass_eye_open(double normal_glass_eye_open) {
                        this.normal_glass_eye_open = normal_glass_eye_open;
                    }

                    public int getNo_glass_eye_close() {
                        return no_glass_eye_close;
                    }

                    public void setNo_glass_eye_close(int no_glass_eye_close) {
                        this.no_glass_eye_close = no_glass_eye_close;
                    }

                    public double getOcclusion() {
                        return occlusion;
                    }

                    public void setOcclusion(double occlusion) {
                        this.occlusion = occlusion;
                    }

                    public double getNo_glass_eye_open() {
                        return no_glass_eye_open;
                    }

                    public void setNo_glass_eye_open(double no_glass_eye_open) {
                        this.no_glass_eye_open = no_glass_eye_open;
                    }

                    public int getNormal_glass_eye_close() {
                        return normal_glass_eye_close;
                    }

                    public void setNormal_glass_eye_close(int normal_glass_eye_close) {
                        this.normal_glass_eye_close = normal_glass_eye_close;
                    }

                    public double getDark_glasses() {
                        return dark_glasses;
                    }

                    public void setDark_glasses(double dark_glasses) {
                        this.dark_glasses = dark_glasses;
                    }
                }

                public static class RightEyeStatusBean {
                    /**
                     * normal_glass_eye_open : 0.01
                     * no_glass_eye_close : 0
                     * occlusion : 0
                     * no_glass_eye_open : 99.989
                     * normal_glass_eye_close : 0
                     * dark_glasses : 0
                     */

                    private double normal_glass_eye_open;
                    private int no_glass_eye_close;
                    private int occlusion;
                    private double no_glass_eye_open;
                    private int normal_glass_eye_close;
                    private int dark_glasses;

                    public double getNormal_glass_eye_open() {
                        return normal_glass_eye_open;
                    }

                    public void setNormal_glass_eye_open(double normal_glass_eye_open) {
                        this.normal_glass_eye_open = normal_glass_eye_open;
                    }

                    public int getNo_glass_eye_close() {
                        return no_glass_eye_close;
                    }

                    public void setNo_glass_eye_close(int no_glass_eye_close) {
                        this.no_glass_eye_close = no_glass_eye_close;
                    }

                    public int getOcclusion() {
                        return occlusion;
                    }

                    public void setOcclusion(int occlusion) {
                        this.occlusion = occlusion;
                    }

                    public double getNo_glass_eye_open() {
                        return no_glass_eye_open;
                    }

                    public void setNo_glass_eye_open(double no_glass_eye_open) {
                        this.no_glass_eye_open = no_glass_eye_open;
                    }

                    public int getNormal_glass_eye_close() {
                        return normal_glass_eye_close;
                    }

                    public void setNormal_glass_eye_close(int normal_glass_eye_close) {
                        this.normal_glass_eye_close = normal_glass_eye_close;
                    }

                    public int getDark_glasses() {
                        return dark_glasses;
                    }

                    public void setDark_glasses(int dark_glasses) {
                        this.dark_glasses = dark_glasses;
                    }
                }
            }

            public static class GlassBean {
                /**
                 * value : None
                 */

                private String value;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class BlurBean {
                /**
                 * blurness : {"threshold":50,"value":0.236}
                 * motionblur : {"threshold":50,"value":0.236}
                 * gaussianblur : {"threshold":50,"value":0.236}
                 */

                private BlurnessBean blurness;
                private MotionblurBean motionblur;
                private GaussianblurBean gaussianblur;

                public BlurnessBean getBlurness() {
                    return blurness;
                }

                public void setBlurness(BlurnessBean blurness) {
                    this.blurness = blurness;
                }

                public MotionblurBean getMotionblur() {
                    return motionblur;
                }

                public void setMotionblur(MotionblurBean motionblur) {
                    this.motionblur = motionblur;
                }

                public GaussianblurBean getGaussianblur() {
                    return gaussianblur;
                }

                public void setGaussianblur(GaussianblurBean gaussianblur) {
                    this.gaussianblur = gaussianblur;
                }

                public static class BlurnessBean {
                    /**
                     * threshold : 50
                     * value : 0.236
                     */

                    private int threshold;
                    private double value;

                    public int getThreshold() {
                        return threshold;
                    }

                    public void setThreshold(int threshold) {
                        this.threshold = threshold;
                    }

                    public double getValue() {
                        return value;
                    }

                    public void setValue(double value) {
                        this.value = value;
                    }
                }

                public static class MotionblurBean {
                    /**
                     * threshold : 50
                     * value : 0.236
                     */

                    private int threshold;
                    private double value;

                    public int getThreshold() {
                        return threshold;
                    }

                    public void setThreshold(int threshold) {
                        this.threshold = threshold;
                    }

                    public double getValue() {
                        return value;
                    }

                    public void setValue(double value) {
                        this.value = value;
                    }
                }

                public static class GaussianblurBean {
                    /**
                     * threshold : 50
                     * value : 0.236
                     */

                    private int threshold;
                    private double value;

                    public int getThreshold() {
                        return threshold;
                    }

                    public void setThreshold(int threshold) {
                        this.threshold = threshold;
                    }

                    public double getValue() {
                        return value;
                    }

                    public void setValue(double value) {
                        this.value = value;
                    }
                }
            }

            public static class SmileBean {
                /**
                 * threshold : 50
                 * value : 4.827
                 */

                private int threshold;
                private double value;

                public int getThreshold() {
                    return threshold;
                }

                public void setThreshold(int threshold) {
                    this.threshold = threshold;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class FacequalityBean {
                /**
                 * threshold : 70.1
                 * value : 0.006
                 */

                private double threshold;
                private double value;

                public double getThreshold() {
                    return threshold;
                }

                public void setThreshold(double threshold) {
                    this.threshold = threshold;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }
        }

        public static class FaceRectangleBean {
            /**
             * width : 228
             * top : 293
             * left : 962
             * height : 228
             */

            private int width;
            private int top;
            private int left;
            private int height;

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getTop() {
                return top;
            }

            public void setTop(int top) {
                this.top = top;
            }

            public int getLeft() {
                return left;
            }

            public void setLeft(int left) {
                this.left = left;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }
        }
    }
}
