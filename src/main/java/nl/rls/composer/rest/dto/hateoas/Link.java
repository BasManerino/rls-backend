//package nl.rls.composer.rest.dto.hateoas;
///*
// * Copyright 2012-2017 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import lombok.*;
//import org.springframework.hateoas.IanaLinkRelations;
//import org.springframework.hateoas.LinkRelation;
//import org.springframework.hateoas.TemplateVariable;
//import org.springframework.hateoas.UriTemplate;
//import org.springframework.util.Assert;
//import org.springframework.util.StringUtils;
//
//import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.annotation.XmlTransient;
//import javax.xml.bind.annotation.XmlType;
//import java.io.Serializable;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// * Value object for links.
// *
// * @author Oliver Gierke
// * @author Greg Turnquist
// */
//@XmlType(name = "link", namespace = Link.ATOM_NAMESPACE)
//@JsonIgnoreProperties("templated")
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor(access = AccessLevel.PACKAGE)
//@Getter
//@EqualsAndHashCode(of = {"rel", "href", "title"})
//public class Link implements Serializable {
//
//    public static final String ATOM_NAMESPACE = "http://www.w3.org/2005/Atom";
//    public static final LinkRelation REL_SELF = IanaLinkRelations.SELF;
//    public static final String REL_FIRST = "first";
//    public static final String REL_PREVIOUS = "prev";
//    public static final String REL_NEXT = "next";
//    public static final String REL_LAST = "last";
//    private static final long serialVersionUID = -9037755944661782121L;
//    private static final String URI_PATTERN = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
//    private @XmlAttribute
//    @With
//    LinkRelation rel;
//    private @XmlAttribute
//    @With
//    String href;
//    private @XmlAttribute
//    @With
//    String title;
//    private @XmlTransient
//    @JsonIgnore
//    UriTemplate template;
//
//    /**
//     * Creates a new link to the given URI with the self rel.
//     *
//     * @param href must not be {@literal null} or empty.
//     * @see #REL_SELF
//     */
//    public Link(String href) {
//        this(href, REL_SELF);
//    }
//
//    /**
//     * Creates a new {@link Link} to the given URI with the given rel.
//     *
//     * @param href must not be {@literal null} or empty.
//     * @param rel  must not be {@literal null} or empty.
//     */
//    public Link(String href, LinkRelation rel) {
//        this(new UriTemplate(href), rel);
//    }
//
//    /**
//     * Creates a new Link from the given {@link UriTemplate} and rel.
//     *
//     * @param template must not be {@literal null}.
//     * @param rel      must not be {@literal null} or empty.
//     */
//    public Link(UriTemplate template, LinkRelation rel) {
//
//        Assert.notNull(template, "UriTemplate must not be null!");
//        Assert.hasText(rel.value(), "Rel must not be null or empty!");
//
//        this.template = template;
//        this.href = template.toString();
//        this.rel = rel;
//    }
//
//    /**
//     * Factory method to easily create {@link Link} instances from RFC-5988 compatible {@link String} representations of a
//     * link. Will return {@literal null} if an empty or {@literal null} {@link String} is given.
//     *
//     * @param element an RFC-5899 compatible representation of a link.
//     * @return
//     * @throws IllegalArgumentException if a non-empty {@link String} was given that does not adhere to RFC-5899.
//     * @throws IllegalArgumentException if no {@code rel} attribute could be found.
//     */
////    public static Link valueOf(String element) {
////
////        if (!StringUtils.hasText(element)) {
////            return null;
////        }
////
////        Pattern uriAndAttributes = Pattern.compile("<(.*)>;(.*)");
////        Matcher matcher = uriAndAttributes.matcher(element);
////
////        if (matcher.find()) {
////
////            Map<String, String> attributes = getAttributeMap(matcher.group(2));
////
////            if (!attributes.containsKey("rel")) {
////                throw new IllegalArgumentException("Link does not provide a rel attribute!");
////            }
////
////            Link link = new Link(matcher.group(1), attributes.get("rel"));
////
////            if (attributes.containsKey("title")) {
////                link = link.withTitle(attributes.get("title"));
////            }
////
////            return link;
////
////        } else {
////            throw new IllegalArgumentException(String.format("Given link header %s is not RFC5988 compliant!", element));
////        }
////    }
//
//    /**
//     * Parses the links attributes from the given source {@link String}.
//     *
//     * @param source
//     * @return
//     */
//    private static Map<String, String> getAttributeMap(String source) {
//
//        if (!StringUtils.hasText(source)) {
//            return Collections.emptyMap();
//        }
//
//        Map<String, String> attributes = new HashMap<String, String>();
//        Pattern keyAndValue = Pattern
//                .compile("(\\w+)=\"(\\p{Lower}[\\p{Lower}\\p{Digit}\\.\\-\\s]*|" + URI_PATTERN + ")\"");
//        Matcher matcher = keyAndValue.matcher(source);
//
//        while (matcher.find()) {
//            attributes.put(matcher.group(1), matcher.group(2));
//        }
//
//        return attributes;
//    }
//
//    /**
//     * Returns a {@link Link} pointing to the same URI but with the {@code self} relation.
//     *
//     * @return
//     */
//    public Link withSelfRel() {
//        return withRel(IanaLinkRelations.SELF);
//    }
//
//    /**
//     * Returns the variable names contained in the template.
//     *
//     * @return
//     */
//    @JsonIgnore
//    public List<String> getVariableNames() {
//        return getUriTemplate().getVariableNames();
//    }
//
//    /**
//     * Returns all {@link TemplateVariables} contained in the {@link Link}.
//     *
//     * @return
//     */
//    @JsonIgnore
//    public List<TemplateVariable> getVariables() {
//        return getUriTemplate().getVariables();
//    }
//
//    /**
//     * Returns whether the link is templated.
//     *
//     * @return
//     */
//    public boolean isTemplated() {
//        return !getUriTemplate().getVariables().isEmpty();
//    }
//
//    /**
//     * Turns the current template into a {@link Link} by expanding it using the given parameters.
//     *
//     * @param arguments
//     * @return
//     */
//    public Link expand(Object... arguments) {
//        return new Link(getUriTemplate().expand(arguments).toString(), getRel());
//    }
//
//    /**
//     * Turns the current template into a {@link Link} by expanding it using the given parameters.
//     *
//     * @param arguments must not be {@literal null}.
//     * @return
//     */
//    public Link expand(Map<String, ? extends Object> arguments) {
//        return new Link(getUriTemplate().expand(arguments).toString(), getRel());
//    }
//
//    private UriTemplate getUriTemplate() {
//
//        if (template == null) {
//            this.template = new UriTemplate(href);
//        }
//
//        return template;
//    }
//
//    /*
//     * (non-Javadoc)
//     * @see java.lang.Object#toString()
//     */
//    @Override
//    public String toString() {
//
//        String linkString = String.format("<%s>;rel=\"%s\"", href, rel);
//
//        if (title != null) {
//            linkString += ";title=\"" + title + "\"";
//        }
//
//        return linkString;
//    }
//}
