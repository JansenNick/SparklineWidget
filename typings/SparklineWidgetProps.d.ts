/**
 * This file was generated from SparklineWidget.xml
 * WARNING: All changes made to this file will be overwritten
 * @author Mendix UI Content Team
 */
import { CSSProperties } from "react";
import { EditableValue } from "mendix";

export interface SparklineDataType {
    number: EditableValue<BigJs.Big>;
}

export interface SparklineDataPreviewType {
    number: string;
}

export interface SparklineWidgetContainerProps {
    name: string;
    class: string;
    style?: CSSProperties;
    tabIndex: number;
    color: string;
    sparklineData: SparklineDataType[];
}

export interface SparklineWidgetPreviewProps {
    class: string;
    style: string;
    color: string;
    sparklineData: SparklineDataPreviewType[];
}
