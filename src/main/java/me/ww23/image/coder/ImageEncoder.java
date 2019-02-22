/*
 * Copyright (c) 2019 ww23(https://github.com/ww23/BlindWatermark).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.ww23.image.coder;

import me.ww23.image.converter.Converter;

import static org.bytedeco.javacpp.opencv_core.CV_8U;

import me.ww23.image.util.Checker;
import org.bytedeco.javacpp.opencv_core.Mat;

public class ImageEncoder extends Encoder {

    public ImageEncoder(Converter converter) {
        super(converter);
    }

    @Override
    public void addWatermark(Mat com, String watermark) {
        this.converter.addImageWatermark(com, Checker.read(watermark, CV_8U));
    }
}